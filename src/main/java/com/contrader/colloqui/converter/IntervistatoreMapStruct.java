package com.contrader.colloqui.converter;

import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.model.Intervistatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IntervistatoreMapStruct extends MapStruct<Intervistatore,IntervistatoreDTO>{
}
