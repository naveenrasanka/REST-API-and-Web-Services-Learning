package com.naveen.app.secondrestapiproject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Path("aliens")
public class AlienResouses {

@GET
@Produces(MediaType.APPLICATION_XML)
public List<Alien> getAlien(){
    System.out.println("Get Alien Called...");

    Alien a1=new Alien();
    a1.setName("naveen");
    a1.setPoint(60);

    Alien a2=new Alien();
    a2.setName("rasanka");
    a2.setPoint(50);

    List<Alien> alien=new ArrayList<>();
    alien= Arrays.asList(a1,a2);

    return alien;
}

}
