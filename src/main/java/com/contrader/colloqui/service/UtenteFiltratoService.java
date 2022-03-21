package com.contrader.colloqui.service;

import com.contrader.colloqui.converter.UtenteFiltratoConverter;
import com.contrader.colloqui.dao.UtenteFiltratoDAO;
import com.contrader.colloqui.dto.UtenteFiltratoDTO;
import com.contrader.colloqui.model.UtenteFiltrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UtenteFiltratoService extends AbstractService<UtenteFiltrato, UtenteFiltratoDTO>{

    @Autowired
    private UtenteFiltratoConverter utenteFiltratoConverter;

    @Autowired
    private UtenteFiltratoDAO utenteFiltratoDAO;

    public void inserisci(UtenteFiltratoDTO utenteFiltratoDTO){
        utenteFiltratoDAO.insert(converter.toEntity(utenteFiltratoDTO));
    }

    public List<UtenteFiltratoDTO> sortGraduatoria(){

        // con i DAO prendo i candidati, li converto in dto e con gli stream li ordino in modo decrescente (sulla val complessiva),
        // infine li salvo in "sortedList" e restituisco la lista
        List<UtenteFiltratoDTO> sortedList = utenteFiltratoConverter.toDTOList(utenteFiltratoDAO.findAll()).stream()
                .sorted(Comparator.comparing(UtenteFiltratoDTO::getValutazioneComplessiva).reversed())
                .collect(Collectors.toList());

        return sortedList;
    }
}
