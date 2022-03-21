package com.contrader.colloqui.controller;

import com.contrader.colloqui.dao.CandidatoDAO;
import com.contrader.colloqui.dto.CandidatoDTO;
import com.contrader.colloqui.dto.UtenteFiltratoDTO;
import com.contrader.colloqui.service.CandidatoService;
import com.contrader.colloqui.service.UtenteFiltratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Candidato")
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @Autowired
    private CandidatoDAO candidatoDAO;

    @Autowired
    private UtenteFiltratoService utenteFiltratoService;

    @GetMapping("/mostra_candidati") // tolto "value ="
    public List<CandidatoDTO> mostraCandidati() {
        return candidatoService.getAllUsers();
    }

    @GetMapping("/mostraGraduatoria")
    public List<UtenteFiltratoDTO> mostraGraduatoria() {
        return utenteFiltratoService.sortGraduatoria();
    }

    @PostMapping("/inserisciCandidato")
    public void inserisciCandidato(@RequestBody CandidatoDTO candidatoDTO) {

        // imposto la valutazione complessiva (che è in trentesimi): se in quinti * 6 se decimi * 3 diviso totale valutazioni
        int valutazioneComplessiva = ((candidatoDTO.getValTecnica() * 3) + (candidatoDTO.getValCarattere() * 3) +
                (candidatoDTO.getAutonomia() * 3) + (candidatoDTO.getResilienza() * 3) + (candidatoDTO.getProattivita() * 6) +
                (candidatoDTO.getPrecisione() * 6) + (candidatoDTO.getCommitment() * 6)) / 7;

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
