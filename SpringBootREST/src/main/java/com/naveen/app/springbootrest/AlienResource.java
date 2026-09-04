package com.naveen.app.springbootrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlienResource {
    @RequestMapping("aliens")
        public List<Alien>getAlien(){
            List<Alien>aliens=new ArrayList<>();

            Alien a1=new Alien();
            a1.setName("Naveen");
            a1.setPoint(44);

            Alien a2=new Alien();
            a2.setName("Rasanka");
            a2.setPoint(90);

            aliens.add(a1);
            aliens.add(a2);
            return aliens;
        }
}
