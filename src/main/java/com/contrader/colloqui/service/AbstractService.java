package com.contrader.colloqui.service;

import com.contrader.colloqui.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@org.springframework.stereotype.Service
public abstract class AbstractService<Entity, DTO> implements Service<DTO> {

    @Autowired
    protected CrudRepository<Entity, Long> crudRepository;
    @Autowired
    protected Converter<Entity, DTO> converter;

    public AbstractService() {
    }

    @Override
    public DTO insert(DTO dto) {
        return converter.toDTO(crudRepository.save(converter.toEntity(dto)));
    }

    @Override
    public List<DTO> getAll() {
        return converter.toDTOList((crudRepository.findAll()));
    }

    @Override
    public DTO read(long id) {
        return converter.toDTO(crudRepository.findById(id).get());
    }

    @Override
    public DTO update(DTO dto) {
        return converter.toDTO(crudRepository.save(converter.toEntity(dto)));
    }

    @Override
    public void delete(long id) {
        crudRepository.deleteById(id);
    }

}