package com.contrader.colloqui.dao;

import com.contrader.colloqui.model.Intervistatore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IntervistatoreDAO extends CrudRepository<Intervistatore,Long> {
    // CRUD QUERY
}
