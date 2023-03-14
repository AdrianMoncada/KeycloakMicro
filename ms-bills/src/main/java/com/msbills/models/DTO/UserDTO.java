package com.msbills.models.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String username;
    private String avatar;
    private String email;
    private String firstName;
    private String lastName;

    public UserDTO(String username) {
        this.username = username;
    }
}
