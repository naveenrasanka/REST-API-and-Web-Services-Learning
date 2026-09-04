package com.naveen.app.secondrestapiproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

    List<Alien>aliens;
    Connection con=null;
    Alien a =new Alien();
    public AlienRepository(){

        String url="jdbc:mysql://localhost:3306/servletlearn";
        String user="root";
        String pwd="1234";
        try {
           // Class.forName()
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,user,pwd);


        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
//        aliens=new ArrayList<>();
//
//        Alien a1=new Alien();
//        a1.setName("naveen");
//        a1.setPoint(60);
//
//        Alien a2=new Alien();
//        a2.setName("rasanka");
//        a2.setPoint(50);
//
//        aliens.add(a1);
//        aliens.add(a2);

    }
    public List<Alien> getAliens(){

        List<Alien> aliens=new ArrayList<>();
        String query="SELECT * FROM alien";
        try {
            PreparedStatement ps=con.prepareStatement(query);
           ResultSet rs= ps.executeQuery();

           while (rs.next()){
               Alien a =new Alien();
                a.setName(rs.getString("name"));
                a.setPoint(rs.getInt("point"));
               aliens.add(a);

           }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return aliens;
    }
    public  Alien getAlien(int id){
//        Alien a1=null;
//        for (Alien a: aliens){
//                if(a.getPoint()==id){
//                return a;
//                }
//        }
        String query="SELECT * FROM alien where point=?";

        try {
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1,id);

            ResultSet rs= ps.executeQuery();

            if (rs.next()){

                a.setPoint(rs.getInt(1));
                a.setName(rs.getString(2));

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     return a;
    }

    public void create(Alien a1) {
        String query="INSERT INTO alien VALUES(?,?)";

        try {
            PreparedStatement ps=con.prepareStatement(query);

            ps.setString(1,a1.getName());
            ps.setInt(2,a1.getPoint());

           int row= ps.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
