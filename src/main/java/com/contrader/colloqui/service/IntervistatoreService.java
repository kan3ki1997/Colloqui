package com.contrader.colloqui.service;

import com.contrader.colloqui.converter.IntervistatoreMapStruct;
import com.contrader.colloqui.dao.IntervistatoreDAO;
import com.contrader.colloqui.dto.IntervistatoreDTO;
import com.contrader.colloqui.model.Intervistatore;
import com.contrader.colloqui.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class IntervistatoreService extends AbstractService<Intervistatore, IntervistatoreDTO> implements UserDetailsService {

    @Autowired
    private IntervistatoreDAO intervistatoreDAO;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private IntervistatoreMapStruct intervistatoreMapStruct;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        IntervistatoreDTO intervistatoreDTO = intervistatoreMapStruct.toDTO(intervistatoreDAO.findByUsername(username));
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(intervistatoreDTO.getRole().getNome()));

        return new org.springframework.security.core.userdetails.User(intervistatoreDTO.getUsername(), intervistatoreDTO.getPassword(), authorities);
    }

    @Override
    public IntervistatoreDTO insert(IntervistatoreDTO intervistatoreDTO) {
        intervistatoreDTO.setPassword(passwordEncoder.encode(intervistatoreDTO.getPassword()));
        return intervistatoreMapStruct.toDTO(intervistatoreDAO.save(intervistatoreMapStruct.toEntity(intervistatoreDTO)));
    }

    public IntervistatoreDTO getByUsernameAndPassword(String username, String password) {
        return intervistatoreMapStruct.toDTO(intervistatoreDAO.findByUsernameAndPassword(username, password));
    }

    public IntervistatoreDTO getUser(Long id) {
        return intervistatoreMapStruct.toDTO(intervistatoreDAO.findById(id.longValue()));
    }


    public IntervistatoreDTO getUserByUsername(String username) {
        return intervistatoreMapStruct.toDTO(intervistatoreDAO.findByUsername(username));
    }

}
