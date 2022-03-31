package com.contrader.colloqui.dao;

import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.model.Intervistatore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IntervistatoreDAO extends CrudRepository<Intervistatore, Long> {

    Intervistatore findByUsernameAndPassword(String username, String password);

    IntervistatoreDTO findById(String id);
}
