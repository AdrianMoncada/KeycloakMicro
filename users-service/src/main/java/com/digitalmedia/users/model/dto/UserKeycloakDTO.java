package com.digitalmedia.users.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Data
public class UserKeycloakDTO {
    private String userName;
    private String email;

    private String id;

    public UserKeycloakDTO(String userName, String email, String id) {
        this.userName = userName;
        this.email = email;
        this.id = id;
    }
}
