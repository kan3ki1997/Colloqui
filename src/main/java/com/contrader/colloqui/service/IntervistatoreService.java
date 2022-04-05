package com.contrader.colloqui.service;

import com.contrader.colloqui.converter.IntervistatoreMapStruct;
import com.contrader.colloqui.dao.IntervistatoreDAO;
import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.model.Intervistatore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntervistatoreService extends AbstractService<Intervistatore,IntervistatoreDTO>{

    @Autowired
    private IntervistatoreDAO intervistatoreDAO;

    @Autowired
    private IntervistatoreMapStruct intervistatoreMapStruct;

    public IntervistatoreDTO getByUsernameAndPassword(String username, String password) {
        return intervistatoreMapStruct.toDTO(intervistatoreDAO.findByUsernameAndPassword(username, password));
    }

    public IntervistatoreDTO getUser(Long id){
        return intervistatoreMapStruct.toDTO(intervistatoreDAO.findById(id.longValue()));
    }
}
