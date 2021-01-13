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
//import Model.UsersDB.getUserByUserName;
import java.util.List;
import javax.servlet.http.Cookie;

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
 *
 * @author Jonathan Roddy
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet  {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
        ////////////////////////////////////////////////////////////////////////
        
            Users currentStaff = null;
            UsersDB repo = new UsersDB();
            
            String nextPage;
            boolean found = false;

            System.out.println("/////////////////////////////////////////////// BEFORE");
            String username = request.getParameter("username");
                String password = request.getParameter("password");
                String rememberMe = request.getParameter("rememberMe");
            try{
//                String username = request.getParameter("username");
//                String password = request.getParameter("password");
//                String rememberMe = request.getParameter("rememberMe");
System.out.println("/////////////////////////////////////////////// INSIDE tRY");
                UsernamePasswordToken token = new UsernamePasswordToken(username, password);
                if("on".equals(rememberMe))
                    token.setRememberMe(true);

                org.apache.shiro.subject.Subject currentUser = SecurityUtils.getSubject();
                currentUser.login(token);

                //currentStaff = StaffDB.getStaffByEmail(username);         

//                Cookie[] cookies = request.getCookies();
//                for(Cookie c: cookies){
//                    if("currentStaff".equals(c.getName())){ 
//                        c.setValue(currentStaff.getUsername().replace(" ", "-"));
//                        c.setPath("/");
//                        response.addCookie(c);
//                        found = true;
//                    }     
//                } 
//
//                if(!found){
//                    Cookie c = new Cookie("currentStaff",currentStaff.getUsername().replace(" ", "-"));                
//                    c.setMaxAge(60*60*24*365*2);
//                    c.setPath("/");
//                    response.addCookie(c);     
//                }
            }catch (UnknownAccountException uae) {
            log("Unknown Account " + uae);
            nextPage = "login.jsp";
            request.setAttribute("error", "Unknown Account");
            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
            rd.forward(request, response);
            }
            
//        } catch (IncorrectCredentialsException ice) {
//            log("Incorrect Credentials " + ice);
//            nextPage = "login.jsp";
//            request.setAttribute("error", "Incorrect Credentials");
//            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
//            rd.forward(request, response);
//        } catch (LockedAccountException lae) {
//            log("Locked Account " + lae);
//            nextPage = "login.jsp";
//            request.setAttribute("error", "Locked Account");
//            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
//            rd.forward(request, response);
//        } catch (ExcessiveAttemptsException eae) {
//            log("Excessive Attempts " + eae);
//            nextPage = "login.jsp";
//            request.setAttribute("error", "Excessive Attempts");
//            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
//            rd.forward(request, response);
//        } catch (AuthenticationException ae) {
//            log("Authentication Error " + ae);
//            nextPage = "login.jsp";
//            request.setAttribute("error", "Authentication Error");
//            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
//            rd.forward(request, response);
//        } catch (UnavailableSecurityManagerException usme) {
//            log("Unavailable Security Manager " + usme);
//            nextPage = "login.jsp";
//            request.setAttribute("error", "Unavailable Security Manager");
//            RequestDispatcher rd = request.getRequestDispatcher(nextPage);
//            rd.forward(request, response);
//        }
           
//            // using google guava
//        String sha256hex = Hashing.sha256().hashString(originalString, StandardCharsets.UTF_8).toString();       
//        System.out.println(sha256hex);
            
        System.out.println("/////////////////////////////////////////////// AFTER TRY"+ username + " " + password);   
        nextPage ="index.jsp";
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