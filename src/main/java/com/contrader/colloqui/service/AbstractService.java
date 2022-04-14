package com.contrader.colloqui.service;

import com.contrader.colloqui.converter.MapStruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public abstract class AbstractService<Entity, DTO> implements Service<DTO> {

    @Autowired
    protected CrudRepository<Entity, Long> crudRepository;

    @Autowired
    private MapStruct<Entity, DTO> mapStruct;

    public AbstractService() {
    }

    @Override
    public DTO insert(DTO dto) {
        return mapStruct.toDTO(crudRepository.save(mapStruct.toEntity(dto)));
    }

    @Override
    public List<DTO> getAll() {
        return mapStruct.toDTOList((crudRepository.findAll()));
    }

    @Override
    public DTO read(long id) {
        return mapStruct.toDTO(crudRepository.findById(id).get());
    }

    @Override
    public DTO update(DTO dto) {
        return mapStruct.toDTO(crudRepository.save(mapStruct.toEntity(dto)));
    }

    @Override
    public void delete(long id) {
        crudRepository.deleteById(id);
    }

}