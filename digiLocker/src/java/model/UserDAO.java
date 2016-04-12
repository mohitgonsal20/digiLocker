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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohit
 */
public class UserDAO extends BaseDAO1 {
     Connection connection;
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet rs;

    public boolean createUser(User u) {
        
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "insert into HR.USER (FIRSTNAME, LASTNAME, U_USERNAME, U_PASSWD, digiid, STATUS, Email) values(?,?,?,?,?,?,?)";
        try {
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,u.getFirstName());
            preparedStatement.setString(2,u.getLastName());
            preparedStatement.setString(3,u.getUserName());
            preparedStatement.setString(4,u.getPassWord());
            preparedStatement.setInt(5,u.getDigiid());
            preparedStatement.setString(6,u.getStatus());
            preparedStatement.setString(7,u.getEmail());
        
        
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

    public List<User> findPendingUsers() {
        
        ArrayList<User> addlist=new ArrayList<User>();
        
        String sql="select * from HR.user where Status = 'Pending'";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement=connection.prepareStatement(sql);
          
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {   User c  = new User();
                System.out.println("test");
                
                c.setFirstName(rs.getString(1));
                c.setLastName(rs.getString(2));
                c.setUserName(rs.getString(3));
                c.setPassWord(rs.getString(4));
                c.setDigiid(rs.getInt(5));
                c.setStatus(rs.getString(6));
                
                
                addlist.add(c);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return addlist;
        
        
        
        
    }

    public boolean checkLogin(User a) {
       try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select * from HR.USER where U_USERNAME=? AND U_PASSWD= ?";
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
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         return false;
    }

    public User setData(User a) {
        User c = new User();
        
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "select FIRSTNAME,LASTNAME,digiid,Status,Email from HR.USER where U_USERNAME=? AND U_PASSWD= ?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,a.getUserName());
                
                preparedStatement.setString(2,a.getPassWord());
            
                rs=preparedStatement.executeQuery();
                
                
                c.setUserName(a.getUserName());
                c.setPassWord(a.getPassWord());
                
                rs.next();
               
                // c.setAdminId(rs.getInt("A_ID"));
                c.setFirstName(rs.getString("FIRSTNAME"));
                c.setLastName(rs.getString("LASTNAME"));
                c.setDigiid(rs.getInt("digiid"));
                c.setStatus(rs.getString("Status"));
                c.setEmail(rs.getString("Email"));
            
                rs.close();
             
                
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      
       return c;
    }

    public boolean update(User u) {
        
        try {
            connection=getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           String sql = "UPDATE HR.USER  set Status=? where digiid=?";
        try {
                preparedStatement = connection.prepareStatement(sql);
                
                preparedStatement.setString(1,u.getStatus());
                
                preparedStatement.setInt(2,u.getDigiid());
            
               int count =preparedStatement.executeUpdate();
                if(count>0)
                {
                    System.out.println("Successfully Updated");
                    return true;
                }else{
                    System.out.println("Update failed");
                    return false;
                }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return false;
    }

    public boolean checkPending() {
        
        String sql="select * from HR.user where Status = 'Pending'";
        try {
            connection = getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement=connection.prepareStatement(sql);
          
            rs=preparedStatement.executeQuery();
            while(rs.next())
            {   
                return true;
                
            }
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        return false;
    }


    
    
    
}
