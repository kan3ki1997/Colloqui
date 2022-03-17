package com.contrader.colloqui.service;

import com.contrader.colloqui.converter.CandidatoConverter;
import com.contrader.colloqui.dao.CandidatoDAO;
import com.contrader.colloqui.dto.CandidatoDTO;
import com.contrader.colloqui.model.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatoService extends AbstractService<Candidato, CandidatoDTO>{

    @Autowired
    private CandidatoDAO candidatoDAO;

    @Autowired
    private CandidatoConverter candidatoConverter;

    public List<CandidatoDTO> getAllUsers() {
        return candidatoConverter.toDTOList(candidatoDAO.findAll());
    }
}
