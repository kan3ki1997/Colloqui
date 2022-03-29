package com.contrader.colloqui.dao;

import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.model.Intervistatore;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IntervistatoreDAO extends MongoRepository<Intervistatore, Long> {

    Intervistatore findByUsernameAndPassword(String username, String password);

    IntervistatoreDTO findById(String id);
}
