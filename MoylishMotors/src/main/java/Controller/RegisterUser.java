/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.security.auth.Subject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Users;
import Model.UsersDB;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.UnavailableSecurityManagerException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
/**

/**
 *
 * @author Jonathan Roddy
 */
@WebServlet(name = "RegisterUser", urlPatterns = {"/RegisterUser"})
public class RegisterUser extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        UsersDB NewAgent = new UsersDB();
        String nextPage;

        try {

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);

            org.apache.shiro.subject.Subject currentUser = SecurityUtils.getSubject();
            currentUser.login(token);

            nextPage = "Registered User.jsp";

            HttpSession session = request.getSession();
            session.setAttribute("NewAgent", NewAgent);
            
            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
            rd.forward(request, response);
            
        } catch (UnknownAccountException uae) {
            log("Unknown Account " + uae);
            nextPage = "Login.jsp";
            request.setAttribute("error", "Unknown Account");
            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
            rd.forward(request, response);
        } catch (IncorrectCredentialsException ice) {
            log("Incorrect Credentials " + ice);
            nextPage = "Login.jsp";
            request.setAttribute("error", "Incorrect Credentials");
            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
            rd.forward(request, response);
        } catch (LockedAccountException lae) {
            log("Locked Account " + lae);
            nextPage = "Login.jsp";
            request.setAttribute("error", "Locked Account");
            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
            rd.forward(request, response);
        } catch (ExcessiveAttemptsException eae) {
            log("Excessive Attempts " + eae);
            nextPage = "Login.jsp";
            request.setAttribute("error", "Excessive Attempts");
            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
            rd.forward(request, response);
        } catch (AuthenticationException ae) {
            log("Authentication Error " + ae);
            nextPage = "Login.jsp";
            request.setAttribute("error", "Authentication Error");
            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
            rd.forward(request, response);
        } catch (UnavailableSecurityManagerException usme) {
            log("Unavailable Security Manager " + usme);
            nextPage = "Login.jsp";
            request.setAttribute("error", "Unavailable Security Manager");
            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
            rd.forward(request, response);
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