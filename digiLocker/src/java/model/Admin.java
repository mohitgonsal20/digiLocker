/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mohit
 */
public class Admin {
    private int adminId;
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;

    
    
  

 
    
    

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    
    public static Admin populateData(HttpServletRequest request, HttpServletResponse response)
    {
        Admin a = new Admin();
        a.setAdminId(Integer.parseInt(request.getParameter("adminId")));
        a.setFirstName(request.getParameter("firstName"));
        a.setLastName(request.getParameter("lastName"));
        a.setUserName(request.getParameter("UserName"));
        a.setPassWord(request.getParameter("Password"));
        
    
        
        
        
           return a;
    }
    
    
}
