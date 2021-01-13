/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cars;
import Model.CarsDB;
import java.io.IOException;
import java.util.Optional;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jonathan Roddy
 */
@WebServlet(name = "updateCarDetails", urlPatterns = {"/updateCarDetails"})
public class updateCarDetails extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        /////////////////////////////// testID - String" + testID);
        //Get listingNumber
        int listingNumber = Integer.parseInt(request.getParameter("listingNumber"));
        int year = Integer.parseInt(request.getParameter("year"));
        int reg = Integer.parseInt(request.getParameter("reg"));
        String make = request.getParameter("make");
        String model = request.getParameter("model");
        String colour = request.getParameter("colour");
        String description = request.getParameter("description");
        double buyPrice = Double.parseDouble(request.getParameter("buyPrice"));
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        int odometer = Integer.parseInt(request.getParameter("odometer"));
        String kph = request.getParameter("kph");
        double engine = Double.parseDouble(request.getParameter("engine"));
        String fuel = request.getParameter("fuel");
        String transmission = request.getParameter("transmission");
        String body = request.getParameter("body");
        String isofix = request.getParameter("isofix");
        String motorTax = request.getParameter("motorTax");
        int preOwnerNumber = Integer.parseInt(request.getParameter("preOwnerNumber"));
        String FSH = request.getParameter("fullServiceHistory");
        Character fullServiceHistory = FSH.charAt(0);
        String note = request.getParameter("note");
        /////////////////////////////// testID - String" + testID);
        System.out.println("//////////////////////////////// listingNumber - int " + listingNumber);
//       int listingNumber = 4294194;

        CarsDB repo = new CarsDB();

        try {
            Optional<Cars> myCar = repo.getByID(listingNumber);
            Cars aCar = myCar.orElse(new Cars());

            aCar.setYear(year);
            aCar.setReg(reg);
            aCar.setMake(make);
            aCar.setModel(model);
            aCar.setColour(colour);
            aCar.setDescription(description);
            aCar.setBuyPrice(buyPrice);
            aCar.setListPrice(listPrice);
            aCar.setOdometer(odometer);
            aCar.setKph(kph);
            aCar.setEngine(engine);
            aCar.setFuel(fuel);
            aCar.setTransmission(transmission);
            aCar.setBody(body);
            aCar.setIsofix(isofix);
            aCar.setMotorTax(motorTax);
            aCar.setPreOwnerNumber(preOwnerNumber);
            aCar.setNote(note);

            System.out.println("//////////////" + aCar.toString());

            repo.update(aCar);

        } catch (Exception ex) {
            log("ERROR: " + ex);
        }
        RequestDispatcher rd = request.getRequestDispatcher("adminPage");
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
