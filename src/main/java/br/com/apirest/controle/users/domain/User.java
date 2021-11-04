package br.com.apirest.controle.users.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class User {

    private UUID id;
    private String name;
    private String email;
    private String username;
    private String password;


}
