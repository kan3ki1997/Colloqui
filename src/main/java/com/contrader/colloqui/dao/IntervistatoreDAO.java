package com.contrader.colloqui.dao;

import com.contrader.colloqui.model.Intervistatore;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IntervistatoreDAO extends MongoRepository<Intervistatore, Long> {

    @Query("{username : ?0, password : ?1}")
    Intervistatore findUserByUsernameAndPassword(String username, String password);
}
