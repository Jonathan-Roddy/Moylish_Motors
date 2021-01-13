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
@WebServlet(name = "DisplayAllCars", urlPatterns = {"/DisplayAllCars"})
public class DisplayAllCars extends HttpServlet {
   
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
            String address;
            
            try { 
                //System.out.println("****************** before call to model");
                
                CarsDB repo = new CarsDB();   
                List<Cars> list = repo.getAll();    
                
//                System.out.println(list.size());
//                
//                System.out.println("*******************" + list.get(0).getDescription());
                
                if (list == null || list.isEmpty()) {
                    address = "/ErrorPage.jsp";
                    request.setAttribute("Error", "Error");
                } else {
                    address = "/DisplayAllCars.jsp";
                    request.setAttribute("list", list);
                }
 
            }//end try
            catch (Exception ex) {
                log("Exeption: " + ex);
                request.setAttribute("Message", ex);
                address  = "ErrorPage.jsp";
            }//end catch
                       

            RequestDispatcher dispatcher = request.getRequestDispatcher(address);
            dispatcher.forward(request, response);
//                CarsDB repo = new CarsDB();     
//                Optional<Cars> opt = repo.getByID(4294194); 
//                Cars c = opt.get();
//                out.println(c);
//                
                

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
