<%-- 
    Document   : DisplayTeam
    Created on : 15-Nov-2020, 13:24:17
    Author     : Jonathan Roddy
--%>
<%@include file="/Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controller.DisplayAllVendors"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="text-center">
    <br><br>
    <h2>Meet The Service And Parts Team</h2>
    <hr>
    <div class="myCard">

        <img src="Assets/SalesPeople/JR.jpg" alt="JR">
        <h4>Jonathan Roddy</h4>
        <h4>Director</h4>

        <br>
    </div>

    <h3>Sales Vendor</h3>
    <br>
    <div>

        

            <div class="cardRow">
                 <c:forEach items="${list}" var="aVendor">
                <div class="column">
                   
                    <div class="card">
                        
                        <img src="Assets/SalesPeople/${aVendor.fullName}.jpg" alt="${aVendor.fullName}">
                        <h4>${aVendor.fullName}</h4> 
                        <h4>${aVendor.phoneNumber}</h4> 
                        <hr>
                        <h5>Joined: ${aVendor.joined} </h5>
                        
                    </div>
                    
                </div>
                </c:forEach>
            </div>

            <br>        
        


    </div>

    <!--    <table>
            <thead>
                <tr>
                    <th>Hello</th>
                    <th>Hello</th> 
                </tr>
            </thead>
            <tbody>
    <c:forEach items="${list}" var="aVendor">
        <tr>
            <td>${aVendor.fullName}</td>
            <td>${aVendor.phoneNumber}</td>
        </tr>  
    </c:forEach>

</tbody>

</table>-->



    <br><br>

</div>
<%@include file="/Footer.jsp"%>
