<%@ page language="java" import="java.util.*,java.io.*" pageEncoding="GBK"%> 
<%@ page contentType="application/msexcel" %> 
<%
    response.setHeader("Content-disposition", "attachment; filename=CarsDB.xls");
%> 
<%@page import="Model.Cars"%>
<%@page import="Model.CarsDB"%>
<%@page import="Model.Vendor"%>
<%@page import="Model.PreOwner"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> 
<html> 
    <head> 
        <base href="<%=basePath%>"> 
        <title>jdbc test</title> 
        <meta http-equiv="pragma" content="no-cache"> 
        <meta http-equiv="cache-control" content="no-cache"> 
        <meta http-equiv="expires" content="0">   
        <meta http-equiv="keywords" content="keyword1,keyword2,keyword3"> 
        <meta http-equiv="description" content="This is my page"> 
        <!-- 
        <link rel="stylesheet" type="text/css" href="styles.css"> 
        --> 
    </head> 
    <body> 
        <br> 
        <table border="1" width="100%"> 
            <tr> 
                <td>listingNumber</td> 
                <td>year</td> 
                <td>reg</td> 
                <td>make</td> 
                <td>model</td> 
                <td>colour</td> 
                <td>descriptionr</td> 
                <td>buyPrice</td> 
                <td>listPrice</td> 
                <td>odometer</td> 
                <td>kph</td> 
                <td>engine</td> 
                <td>fuel</td> 
                <td>transmission</td> 
                <td>body</td> 
                <td>isofix</td> 
                <td>motorTax</td> 
                <td>preOwnerNumber</td> 
                <td>fullServiceHistory</td> 
                <td>salesPersonIDr</td> 
                <td>preOwnerID</td> 
                <td>note</td> 
                
            </tr> 
            
            
            <%
                CarsDB repo = new CarsDB();
                List<Cars> list = repo.getAll();

                for (int i = 0; i < list.size(); i++) {
                    int t_listingNumber = list.get(i).getListingNumber();
                    int t_year = list.get(i).getYear();
                    int t_reg = list.get(i).getReg();
                    String t_make = list.get(i).getMake();
                    String t_model = list.get(i).getModel();
                    String t_colour = list.get(i).getColour();
                    String t_descriptionr = list.get(i).getDescription();
                    int t_buyPrice = list.get(i).getBuyPrice();
                    int t_listPrice = list.get(i).getListPrice();
                    int t_odometer = list.get(i).getOdometer();
                    String t_kph = list.get(i).getKph();
                    Double t_engine = list.get(i).getEngine();
                    String t_fuel = list.get(i).getFuel();
                    String t_transmission = list.get(i).getTransmission();
                    String t_body = list.get(i).getBody();
                    String t_isofix = list.get(i).getIsofix();
                    String t_motorTax = list.get(i).getMotorTax();
                    int t_preOwnerNumber = list.get(i).getPreOwnerNumber();
                    Character t_fullServiceHistory = list.get(i).getFullServiceHistory();
                    Vendor t_salesPersonIDr = list.get(i).getSalesPersonID();
                    PreOwner t_preOwnerID = list.get(i).getPreOwnerID();
                    String t_note = list.get(i).getNote();

            %> 
            <tr> 
                <td><%=t_listingNumber %></td> 
                <td><%=t_year %></td> 
                <td><%=t_reg %></td> 
                <td><%=t_make %></td> 
                <td><%=t_model %></td> 
                <td><%=t_colour %></td> 
                <td><%=t_descriptionr%></td> 
                <td><%=t_buyPrice%></td> 
                <td><%=t_listPrice%></td> 
                <td><%=t_odometer%></td> 
                <td><%=t_kph%></td> 
                <td><%=t_engine%></td> 
                <td><%=t_fuel%></td> 
                <td><%=t_transmission%></td> 
                <td><%=t_body%></td> 
                <td><%=t_isofix%></td> 
                <td><%=t_motorTax%></td> 
                <td><%=t_preOwnerNumber%></td> 
                <td><%=t_fullServiceHistory%></td> 
                <td><%=t_salesPersonIDr%></td> 
                <td><%=t_preOwnerID%></td> 
                <td><%=t_note%></td> 

            </tr> 
            <%
                }
            %> 
        </table> 
    </body> 
</html>