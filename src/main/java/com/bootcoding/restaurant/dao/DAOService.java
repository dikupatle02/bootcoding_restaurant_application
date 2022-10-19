package com.bootcoding.restaurant.dao;


import java.sql.*;
public class DAOService {
    public void getData() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * from emp where sal>=3000");
            while (res.next()) {
                System.out.println("Name= " + res.getString("ename"));
                System.out.println("sal= " + res.getLong("Sal"));
                System.out.println("empno= " + res.getLong("empno"));
                System.out.println("job= " + res.getString("job"));
                System.out.println("manager= " + res.getLong("manager"));
                System.out.println("comm= " + res.getLong("comm"));
                System.out.println("depno= " + res.getLong("deptno"));
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}