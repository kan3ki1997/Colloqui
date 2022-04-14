package com.contrader.colloqui.converter;
import com.contrader.colloqui.dto.RoleDTO;
import com.contrader.colloqui.model.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapStruct extends MapStruct<Role, RoleDTO> {
}
