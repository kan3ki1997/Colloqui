package com.contrader.colloqui.dao;

import com.contrader.colloqui.model.UtenteFiltrato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UtenteFiltratoDAO  extends CrudRepository<UtenteFiltrato,Long> {


}
