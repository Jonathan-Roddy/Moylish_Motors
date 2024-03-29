/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Cars;
import Model.CarsDB;
import java.util.Optional;

/**
 *
 * @author Jonathan Roddy
 */
@WebServlet(name = "editCarDetails", urlPatterns = {"/editCarDetails"})
public class editCarDetails extends HttpServlet {

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

        //Get listingNumber
        int listingNumber = Integer.parseInt(request.getParameter("listingNumber"));

        CarsDB repo = new CarsDB();
        System.out.println("================================================================ Before Try as editCarDetails ");
        try {
            Optional<Cars> myCar = repo.getByID(listingNumber);
            Cars aCar = myCar.orElse(new Cars());

            request.setAttribute("aCar", aCar);
            System.out.println("================================================================ In Try as editCarDetails " + aCar.getListingNumber());
            if (aCar == null) {
                RequestDispatcher rd = request.getRequestDispatcher("ErrorPage.jsp");
                rd.forward(request, response);
            }
        } catch (Exception ex) {
            log("ERROR: " + ex);
        }
        System.out.println("================================================================ After Try as editCarDetails ");
        RequestDispatcher rd = request.getRequestDispatcher("editCarDetails.jsp");
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
