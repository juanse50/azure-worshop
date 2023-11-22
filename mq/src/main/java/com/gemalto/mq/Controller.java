package com.gemalto.mq;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

   @Autowired
   private UserRepository repository;

    @PostMapping("/save")
    public ResponseEntity<String> sed(@RequestBody UserEntity user) {
        //sender.sendMessage();
        repository.save(user);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/get")
    public ResponseEntity<List<UserEntity>>getAll(){
        //sender.sendMessage();
        return new ResponseEntity<List<UserEntity>>(repository.findAll(), HttpStatus.ACCEPTED);
    }

}
