package com.creatingTable;

import java.sql.*;

public class CreatingTable {
     public static void main(String[] args) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }


            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");

                String q = "create table javaTable(id int(20) primary key auto_increment, name varchar(40) not null ,city varchar(400))";
                Statement st = con.createStatement();
                st.executeUpdate(q);
                System.out.println("Table created in database...");

                con.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
}
