package com.naveen.app.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlienResource {

    @Autowired
    AlienRepository repo;

    //@RequestMapping("aliens") ,@PutMapping,@DeleteMapping,@PostMapping
    @GetMapping("aliens")

        public List<Alien>getAlien(){
            List<Alien>aliens= (List<Alien>) repo.findAll();

            return aliens;
        }
}
