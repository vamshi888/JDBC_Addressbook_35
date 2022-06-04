package com.bridgelabz;


import java.sql.*;

public class RetrieveAllTheDataFromDB {
    public static void main(String[] args) throws SQLException {

        String jdbcUrl = "jdbc:mysql://localhost:3306/addressbookservice";
        String userName = "vamshi";
        String password = "vamshi@1234";
        String query = "select * from addressbookforfriends";
        Connection connection;

        connection = DriverManager.getConnection(jdbcUrl, userName, password);
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);

        String userData = "";
        while(result.next()){
            userData = result.getString(1)+ " | " + result.getString(2)+" | " + result.getString(3)+" | "+result.getString(4)+" | "+result.getString(5)+" | "+result.getString(6);
            System.out.println(userData);
        }
        statement.close();
        connection.close();
    }
}