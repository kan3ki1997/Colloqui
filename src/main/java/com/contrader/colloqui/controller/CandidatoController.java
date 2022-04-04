package com.contrader.colloqui.controller;

import com.contrader.colloqui.JWTDemo;
import com.contrader.colloqui.dao.CandidatoDAO;
import com.contrader.colloqui.dto.CandidatoDTO;
import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.dto.UtenteFiltratoDTO;
import com.contrader.colloqui.service.CandidatoService;

import com.contrader.colloqui.service.IntervistatoreService;
import com.contrader.colloqui.service.UtenteFiltratoService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @Autowired
    private IntervistatoreService intervistatoreService;

    @Autowired
    private CandidatoDAO candidatoDAO;

    @Autowired
    private UtenteFiltratoService utenteFiltratoService;

    @GetMapping("/mostraCandidati")
    public List<CandidatoDTO> mostraCandidati(@RequestBody String jwt) {
        try {
            JWTDemo.decodeJWT(jwt);
            return candidatoService.getAllUsers();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @GetMapping("/mostraGraduatoria")
    public ResponseEntity<List<UtenteFiltratoDTO>> mostraGraduatoria(@RequestParam String jwt) {
        try {
            Claims claims = JWTDemo.decodeJWT(jwt);
            IntervistatoreDTO intervistatoreDTO = intervistatoreService.getUser(claims.getId()); // creo un dto tramite l'id della claim
            if (claims.getSubject().equals(intervistatoreDTO.getUsername())) {
                return ResponseEntity.ok(utenteFiltratoService.sortGraduatoria());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }

    @PostMapping("/inserisciCandidato")
    public void inserisciCandidato(@RequestBody @Valid CandidatoDTO candidatoDTO, @RequestParam String jwt) {

        List<Integer> valoriCompetenze = (List<Integer>) candidatoDTO.getListaDiCompetenze().values();
        int sumOfValues = 0;
        for (int i = 0; i < valoriCompetenze.size(); i++) {
            sumOfValues += valoriCompetenze.get(i);
        }

        // imposto la valutazione complessiva (che è in trentesimi): se in quinti * 6 se decimi * 3 diviso totale valutazioni
        int valutazioneComplessiva = ((candidatoDTO.getValTecnica() * 3) + (candidatoDTO.getValCarattere() * 3) +
                (candidatoDTO.getAutonomia() * 3) + (candidatoDTO.getResilienza() * 3) + (candidatoDTO.getProattivita() * 6) +
                (candidatoDTO.getPrecisione() * 6) + (candidatoDTO.getCommitment() * 6) + (sumOfValues) * 3) / (7 + valoriCompetenze.size());

        candidatoDTO.setValComplessiva(valutazioneComplessiva);
        candidatoService.insert(candidatoDTO);

        // passo i dati necessari alla graduatoria impostati nell'utente filtrato
        UtenteFiltratoDTO utenteFiltratoDTO = new UtenteFiltratoDTO();
        utenteFiltratoDTO.setNomeUtente(candidatoDTO.getNome());
        utenteFiltratoDTO.setCognomeUtente(candidatoDTO.getCognome());
        utenteFiltratoDTO.setValutazioneComplessiva(candidatoDTO.getValComplessiva());

        // inserisco l'utente filtrato nella graduatoria e la aggiorno in maniera decrescente
        utenteFiltratoService.inserisci(utenteFiltratoDTO);

    }
}
