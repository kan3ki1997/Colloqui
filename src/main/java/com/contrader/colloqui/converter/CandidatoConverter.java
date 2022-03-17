package com.contrader.colloqui.converter;

import com.contrader.colloqui.dto.CandidatoDTO;
import com.contrader.colloqui.model.Candidato;
import org.springframework.stereotype.Component;

@Component
public class CandidatoConverter extends AbstractConverter<Candidato, CandidatoDTO>{

    @Override
    public Candidato toEntity(CandidatoDTO candidatoDTO) {
        return null;
    }

    @Override
    public CandidatoDTO toDTO(Candidato candidato) {
        return null;
    }
}
