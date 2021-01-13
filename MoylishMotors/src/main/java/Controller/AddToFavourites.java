/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jonathan Roddy
 */

@WebServlet(name = "AddToFavourites", urlPatterns = {"/AddToFavourites"})
public class AddToFavourites extends HttpServlet {

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

        String id = request.getParameter("ListingNumber}");

        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;

        for (Cookie c : cookies) {
            if (c.getName().equals("favourites")) {
                cookie = c;
                break;
            }
        }

        String newCookie = "";

        if (cookie == null) {
            cookie = new Cookie("favourites", id);
        } else if (cookie.getValue().isEmpty()) {
            cookie.setValue(id);
        } else if (!cookie.getValue().contains(id)) {
            newCookie = cookie.getValue() + "-" + id;
            if (newCookie.contains("--")) {
                newCookie = newCookie.replace("--", "-");
            }
            cookie.setValue(newCookie);
        }

        request.setAttribute("carInfavourites", true);

        cookie.setMaxAge(60 * 60 * 24 * 365 * 2);

        response.addCookie(cookie);
        if (cookie == null) {
            RequestDispatcher rd = request.getRequestDispatcher("404.jsp");
            rd.forward(request, response);
        }
        RequestDispatcher rd = request.getRequestDispatcher("DisplayCarDetails");
        rd.forward(request, response);
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
