package com.connect;

import java.sql.*;

public class Demo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
//            System.out.println(con);\

            String q = "select * from customers";
            Statement st = con.createStatement();
            ResultSet set = st.executeQuery(q);
            while (set.next()){
                int id = set.getInt("customer_id");
                String name = set.getString("first_name");
                String city = set.getString("city");
                System.out.println(id);
                System.out.println(name);
                System.out.println(city);
            }

                            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
