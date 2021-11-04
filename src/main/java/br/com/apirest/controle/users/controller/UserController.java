package br.com.apirest.controle.users.controller;

import br.com.apirest.controle.users.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @GetMapping
    public List<User> list(){
        return List.of(new User(UUID.randomUUID(),"Renato","alencar.renato@yahoo.com.br","renatoalencar","123"));
    }

}

