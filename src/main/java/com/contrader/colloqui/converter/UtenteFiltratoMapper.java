package com.contrader.colloqui.converter;

import com.contrader.colloqui.dto.UtenteFiltratoDTO;
import com.contrader.colloqui.model.UtenteFiltrato;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UtenteFiltratoMapper extends MapStruct<UtenteFiltrato, UtenteFiltratoDTO> {
}
