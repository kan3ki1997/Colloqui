package com.contrader.colloqui.controller;

import com.contrader.colloqui.dao.CandidatoDAO;
import com.contrader.colloqui.dto.CandidatoDTO;
import com.contrader.colloqui.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/intervistatore")
public class IntervistatoreController {

    @Autowired
    private CandidatoService candidatoService;
    @Autowired
    private CandidatoDAO candidatoDAO;

    @GetMapping(value = "/mostraGraduatoria")
    public void mostraGraduatoria(HttpServletRequest request) {

    }

    @GetMapping("/inserisciCandidato")
    public void inserisciCandidato(HttpServletRequest request) {

        /* Ad ogni profilo, in fase di creazione, viene assegnato un punteggio in trentesimi basato sulla media di tutte le valutazioni
         (attenzione, le valutazioni hanno scale diverse e devono essere normalizzate in trentasimi prima di costituire la media finale) */
    }


}
