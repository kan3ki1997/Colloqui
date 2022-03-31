package com.contrader.colloqui.dao;

import com.contrader.colloqui.model.Candidato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CandidatoDAO extends CrudRepository<Candidato,Long> {

  // QUERY

}
