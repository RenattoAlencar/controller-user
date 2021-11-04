package br.com.apirest.controle.users.controller;

import br.com.apirest.controle.users.domain.User;
import br.com.apirest.controle.users.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    private DateUtil dateUtil;

    @GetMapping
    public List<User> list(){
       log.info(dateUtil.formatDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new User(UUID.randomUUID(),"Renato","alencar.renato@yahoo.com.br","renatoalencar","123"));
    }

}

