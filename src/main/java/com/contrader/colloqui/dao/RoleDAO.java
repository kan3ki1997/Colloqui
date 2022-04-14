package com.contrader.colloqui.dao;
import com.contrader.colloqui.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RoleDAO extends CrudRepository<Role, Long> {
    Role findByNome(String nome);
}
