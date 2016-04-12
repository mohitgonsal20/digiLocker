/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohit
 */
public class ImagesDAO extends BaseDAO1 {
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
    
    public boolean setPath(Images a)
    {
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = "insert into HR.IMAGEDATA (ID, ONE, TWO, THREE) values(?,?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,a.getId());
            preparedStatement.setString(2,a.getOne());
            preparedStatement.setString(3,a.getTwo());
            preparedStatement.setString(4,a.getThree());
        
                int count = preparedStatement.executeUpdate();
                
                if(count>0)
                {
                    System.out.println("Successfully Inserted");
                    return true;
                }else{
                    System.out.println("insertion failed");
                    return false;
                }
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
        
        
        return false;
    }

    

    public boolean checkPath(Images a) {
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("abc");
        String sql = "select * from HR.imagedata where id=?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setInt(1,a.getId());
                
                System.out.println("mvg");
            
                rs=preparedStatement.executeQuery();
                
                System.out.println("xyz");
                
                if (!rs.isBeforeFirst()) {
                    System.out.println("no rows fetched");
                    return false;
                }
                
                if( rs.next())
              {
                 System.out.println("Found"); 
              return true;
              }
                    System.out.println("not Found");
                    return false;
          
               
                
        } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("not Found");
        return false;
    }

    public Images getPath(Images a) {
        Images c = new Images();
        
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = "select ONE,TWO,THREE from HR.imagedata where id=?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setInt(1,a.getId());
                
                
            
                rs=preparedStatement.executeQuery();
                
                
                rs.next();
                c.setId(a.getId());
                c.setOne(rs.getString("ONE"));
                c.setTwo(rs.getString("TWO"));
                c.setThree(rs.getString("THREE"));
                rs.close();
                
                
                
                
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        return c;
    }
    
}
