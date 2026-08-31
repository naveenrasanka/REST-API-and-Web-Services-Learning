package com.naveen.app.secondrestapiproject;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

    List<Alien>aliens;

    public AlienRepository(){

        aliens=new ArrayList<>();

        Alien a1=new Alien();
        a1.setName("naveen");
        a1.setPoint(60);

        Alien a2=new Alien();
        a2.setName("rasanka");
        a2.setPoint(50);

        aliens.add(a1);
        aliens.add(a2);

    }
    public List<Alien> getAliens(){

        return aliens;
    }
    public  Alien getAlien(int id){
        Alien a1=null;
        for (Alien a: aliens){
                if(a.getPoint()==id){
                return a;
                }
        }
     return null;
    }

    public void create(Alien a1) {
        aliens.add(a1);
    }
}
