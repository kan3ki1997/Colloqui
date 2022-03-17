package com.contrader.colloqui.controller;

import com.contrader.colloqui.service.IntervistatoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Intervistatore")
public class IntervistatoreController {

 //   @Autowired
   // private IntervistatoreService intervistatoreService;

    @GetMapping("/mostraGraduatoria")
    public void mostraGraduatoria(HttpServletRequest request) {

    }

    @GetMapping("/inserisciCandidato")
    public void inserisciCandidato(HttpServletRequest request) {

        /* Ad ogni profilo, in fase di creazione, viene assegnato un punteggio in trentesimi basato sulla media di tutte le valutazioni
         (attenzione, le valutazioni hanno scale diverse e devono essere normalizzate in trentasimi prima di costituire la media finale) */
    }

}
