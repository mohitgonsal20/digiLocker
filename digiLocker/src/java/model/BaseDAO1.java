/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mohit
 */
public class BaseDAO1 {
    
    private Connection con;
    public Connection getConnection() throws ClassNotFoundException, SQLException
    {
        try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		
	}
        try {
		con = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/hr","root", "root");

	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
	}
       // con = DriverManager.getConnection("jdbc:derby://localhost:1527/HR","HR","HR");
        return con;
    }
    
    
}
