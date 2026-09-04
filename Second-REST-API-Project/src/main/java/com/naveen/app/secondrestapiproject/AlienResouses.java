package com.naveen.app.secondrestapiproject;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path("aliens")
public class AlienResouses {

@GET    //fetching resource
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
///tried JSon
//@Produces(MediaType.APPLICATION_JSON)
public List<Alien> getAlien(){
    System.out.println("Get Alien Called...");
//
//    Alien a1=new Alien();
//    a1.setName("naveen");
//    a1.setPoint(60);
//
//    Alien a2=new Alien();
//    a2.setName("rasanka");
//    a2.setPoint(50);
//
//    List<Alien> alien=new ArrayList<>();
//    alien= Arrays.asList(a1,a2);

    AlienRepository repo=new AlienRepository();

    return repo.getAliens();

}
    @GET
    @Path("alien/{point}")//fetching resource with place holder
   // @Produces(MediaType.APPLICATION_XML)
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Alien getaAlien(@PathParam("point")int point){
        AlienRepository repo=new AlienRepository();
        return repo.getAlien(point);

    }
@POST  //creating a resource
@Path("alien")
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
//@Consumes(MediaType.APPLICATION_XML) //Speicifing type XML or Json
public Alien creatAlien(Alien a1){

    AlienRepository repo=new AlienRepository();
    System.out.println(a1);
    repo.create(a1);
    return  a1;

}
    @PUT  //creating a resource
    @Path("alien")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Alien updateAlien(Alien a1){

        AlienRepository repo=new AlienRepository();
        System.out.println(a1);
        if(repo.getAlien(a1.getPoint()).getPoint()==0){
            repo.create(a1);
        }else {
            repo.update(a1);
        }

        return  a1;

    }
@DELETE
@Path("alien/{id}")
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Alien deleteAlien(@PathParam("id")int id){
        AlienRepository repo =new AlienRepository();
        Alien a=repo.getAlien(id);

          if(a.getPoint()!=0){
              repo.delete(id);
          }
          return a;
    }

}
