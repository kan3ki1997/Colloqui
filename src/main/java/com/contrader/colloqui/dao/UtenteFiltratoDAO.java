package com.contrader.colloqui.dao;

import com.contrader.colloqui.model.Candidato;
import com.contrader.colloqui.model.UtenteFiltrato;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UtenteFiltratoDAO  extends MongoRepository<UtenteFiltrato,Long> {


}
