package com.contrader.colloqui.service;

import com.contrader.colloqui.dao.RoleDAO;
import com.contrader.colloqui.dto.RoleDTO;
import com.contrader.colloqui.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractService<Role, RoleDTO>{

    @Autowired
    private RoleDAO roleDAO;

}
