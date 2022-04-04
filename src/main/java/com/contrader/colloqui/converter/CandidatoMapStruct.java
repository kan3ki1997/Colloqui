package com.contrader.colloqui.converter;

import com.contrader.colloqui.dto.CandidatoDTO;
import com.contrader.colloqui.model.Candidato;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CandidatoMapStruct extends MapStruct<Candidato, CandidatoDTO> {
}
