package com.neoteric.functiondemo1.function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDBService {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/world", "root", "25112002");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from world.employee");
            while (rs.next()) {
                String name = rs.getString("name");
                String empId = rs.getString("empId");
                String salary = rs.getString("salary");
                String designation = rs.getString("deasignation");

                System.out.println(" name " + name + " empId " + empId + " salary " + salary + " deasignation " + designation);
            }
        } catch (Exception e) {
            System.out.println("DriverException" + e);
        }
    }

}


