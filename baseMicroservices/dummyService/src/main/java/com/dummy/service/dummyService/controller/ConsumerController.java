package com.dummy.service.dummyService.controller;


import com.dummy.service.dummyService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    UserRestConsumer restConsumer;

    @GetMapping("/get-users")
    List<User> getUsers(){
        System.out.println(restConsumer.getClass().getSimpleName());
        return restConsumer.getAll();
    }

    @PostMapping(value = "/saveUser" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public String savingAUser(@RequestBody User user){
        return restConsumer.savingAUser(user);
    }
}
