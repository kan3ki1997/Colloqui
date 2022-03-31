package com.contrader.colloqui.service;

import com.contrader.colloqui.dao.IntervistatoreDAO;
import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.model.Intervistatore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntervistatoreService extends AbstractService<Intervistatore, IntervistatoreDTO> {

    @Autowired
    private IntervistatoreDAO intervistatoreDAO;

    public Intervistatore doLogin(String username, String password) {
        return intervistatoreDAO.findByUsernameAndPassword(username, password);
    }

    public IntervistatoreDTO getUser(String id){
        return intervistatoreDAO.findById(id);
    }
}
