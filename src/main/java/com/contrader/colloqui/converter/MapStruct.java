package com.contrader.colloqui.converter;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MapStruct<Entity,DTO> {

    Entity toEntity(DTO dto);

    DTO toDTO(Entity entity);

    List<Entity> toEntityList(Iterable<DTO> dtoList);

    List<DTO> toDTOList(Iterable<Entity> entityList);

}
