package com.contrader.colloqui.controller;

import com.contrader.colloqui.converter.CandidatoConverter;
import com.contrader.colloqui.dto.CandidatoDTO;
import com.contrader.colloqui.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Candidato")
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @GetMapping(value = "/mostra_candidati")
    public List<CandidatoDTO> mostraCandidati() {
        return candidatoService.getAllUsers();
    }
}
