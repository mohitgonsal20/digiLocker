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
public class AdminDAO extends BaseDAO1 {
    Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;
    
    public  boolean checkLogin(Admin a)
    {
        
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from HR.ADMIN where A_USERNAME=? AND A_PASSWD= ?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,a.getUserName());
                
                preparedStatement.setString(2,a.getPassWord());
            
                rs=preparedStatement.executeQuery();
                while( rs.next())
              {
              return true;
              }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         return false;
    }

    public Admin setData(Admin a) {
        
        Admin c = new Admin();
        
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select  A_ID,FIRSTNAME,LASTNAME from HR.ADMIN where A_USERNAME=? AND A_PASSWD= ?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,a.getUserName());
                
                preparedStatement.setString(2,a.getPassWord());
            
                rs=preparedStatement.executeQuery();
                
                
                c.setUserName(a.getUserName());
                c.setPassWord(a.getPassWord());
                
                rs.next();
               
                c.setAdminId(rs.getInt("A_ID"));
                c.setFirstName(rs.getString("FIRSTNAME"));
                c.setLastName(rs.getString("LASTNAME"));
            
                rs.close();
             
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      
       return c;
    }

    public void updatePasswd(Admin a, String np) {
        
        
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = "UPDATE HR.ADMIN  set A_PASSWD=? where A_ID=?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,np);
                
                preparedStatement.setInt(2,a.getAdminId());
            
               int count =preparedStatement.executeUpdate();
                if(count>0)
                {
                    System.out.println("Successfully Updated");
                    
                }else{
                    System.out.println("Update failed");
                    
                }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
    }
    
    
   
    
}
