/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.security.auth.Subject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Users;
import Model.UsersDB;
import Model.Cars;
import Model.CarsDB;
import Model.Vendor;
import Model.VendorDB;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.UnavailableSecurityManagerException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;

import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Jonathan Roddy
 */
@WebServlet(name = "adminPage", urlPatterns = {"/adminPage"})
public class adminPage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nextPage;
            
            // get all users
            UsersDB userRepo = new UsersDB();
            List<Users> userList = userRepo.getAll(); 
            //System.out.println(userList.size());
            int userCount = userList.size();
            request.setAttribute("userCount", userCount);
            request.setAttribute("userList", userList);
            
            // get all Cars
            CarsDB carRepo = new CarsDB();   
            List<Cars> carList = carRepo.getAll(); 
            //System.out.println(carList.size());
            int carCount = carList.size();
            request.setAttribute("carCount", carCount);
            request.setAttribute("carList", carList);
            
            // get all Vendors
            VendorDB vendorRepo = new VendorDB();   
            List<Vendor> vendorList = vendorRepo.getAll(); 
            //System.out.println(vendorList.size());
            int vendorCount = vendorList.size();
            request.setAttribute("vendorCount", vendorCount);
            request.setAttribute("vendorList", vendorList);
           
            
            nextPage = "admin/adminPage.jsp";
            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
            rd.forward(request, response);

            ////////////////////////////////////////////////////////////////////////
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
