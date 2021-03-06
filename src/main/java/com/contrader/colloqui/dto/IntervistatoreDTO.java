package com.contrader.colloqui.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IntervistatoreDTO {

    private Long id;
    private String username, password;
    private RoleDTO role;
    private Boolean enabled;
}
