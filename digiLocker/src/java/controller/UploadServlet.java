/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Images;
import model.ImagesDAO;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Mohit
 */
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Random rand = new Random();
            int num = rand.nextInt(90000) + 10000;
            String uploadPath =getServletContext().getRealPath("")+File.separator+num; 
            Images a = new Images();
            
            String [] temp = new String[3];
            int index=0;
            
            
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (!isMultipart) {
        } else {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List items = null;
            try {
                items = upload.parseRequest(request);
                } catch (FileUploadException e) {
                    e.printStackTrace();
                }
            Iterator itr = items.iterator();
            while (itr.hasNext()) {
                FileItem item = (FileItem) itr.next();
                if (item.isFormField()) {
                } else {
                    try {
                    String itemName = item.getName();
                   // int name=1;
                    temp[index]=itemName;
                    index++;
                    //String end=item.getContentType();
                    
                    File uploadDir = new File(uploadPath);
                    if (!uploadDir.exists()) {
                        uploadDir.mkdir();
                        }
                    String filePath = uploadPath + File.separator + itemName;
                    
                    
                
                    File savedFile = new File(filePath);
                    item.write(savedFile);  
                } catch (Exception e) {
                    e.printStackTrace();
                }
                    
                    
            
                    
                    
                    
            }
        }
            
            
         //System.out.println("MVG");
         
         //System.out.println("MVG  "+temp[0]);
         //System.out.println("MVG  "+temp[1]);
         //System.out.println("MVG  "+temp[2]);

            
            
         
            a.setId(num);
            a.setOne(temp[0]);
            a.setTwo(temp[1]);
            a.setThree(temp[2]);
            
            ImagesDAO x= new ImagesDAO();
            
            //System.out.println("Successfully Inserted");

            
            boolean b= x.setPath(a);
            RequestDispatcher rd;
            
            if(b){
                
                request.setAttribute("images",a);
                rd = request.getRequestDispatcher("JSP/success1.jsp");
                
            }
            else
            {
                rd = request.getRequestDispatcher("JSP/adminLogin.jsp");
                
            }
            
            rd.forward(request, response);
            
           
    }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
