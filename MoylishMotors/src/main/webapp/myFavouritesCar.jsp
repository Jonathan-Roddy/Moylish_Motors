<%-- 
    Document   : myFavouritesCar
    Created on : 22-Nov-2020, 19:53:18
    Author     : Jonathan Roddy
--%>

<%@include file="/Header.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<center> <h3>  Favourites </h3></center>

<div class="col-md-8" >
        <div class="row justify-content-center">
            <table class="table table-hover" id="CarTable">
                <thead class="thead-light">
                    <tr>
                        <th scope="col">Listing Number</th>
                        <th scope="col">Year</th>
                        <th scope="col">Reg</th>
                        <th scope="col">Make</th>
                        <th scope="col">Model</th>
                        <th scope="col">Colour</th>
                        <th scope="col">Engine</th>
                        <th scope="col">Fuel</th>
                        <th scope="col">Transmission</th>
                        <th scope="col">Body</th>
                        <th scope="col">Image</th>


                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${list}" var="aCars">
                        <tr>
                            <td>${aCars.listingNumber}</td>
                            <td>${aCars.year}</td>
                            <td>${aCars.reg}</td>
                            <td>${aCars.make}</td>
                            <td>${aCars.model}</td>
                            <td>${aCars.colour}</td>
                            <td>${aCars.engine}</td>
                            <td>${aCars.fuel}</td>
                            <td>${aCars.transmission}</td>
                            <td>${aCars.body}</td>
                            <td>
                                <a href="DisplayCarDetails?listingNumber=${aCars.listingNumber}">
                                    <img src="Assets/Stock/Thumbs/${aCars.listingNumber}.jpeg">
                                </a>
                            </td>
                        </tr>

                    </c:forEach> 


                </tbody> 
            </table>
        </div>
    </div>



<c:choose>
    <c:when test="${favourites != null && favourites != '[null]' && favourites != '[]'}">
        <table id="propertydatatable" class ="display" width='1200' border='1'>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Street</th>
                    <th>City</th>              
                    <th>Price</th>
                    <th>Ber Rating</th>
                    <th>Image</th>

                </tr>
            </thead>
            <tbody>
                <c:forEach items = "${favourites}" var = "favourite"> 
                    <tr>


                        <td>${favourite.id}</td>
                        <td>${favourite.street}</td>
                        <td>${favourite.city}</td>
                        <td><fmt:formatNumber value="${favourite.price}" type="currency" currencySymbol="&euro;" maxFractionDigits="2"/></td>
                        <td><img src="images/BER/${favourite.berRating}.png"/></td>

                        <td><a href="displayProperty?propertyId=${favourite.id}"><img src="images/properties/thumbs/${favourite.photo}"></td>
                                </tr>

                            </c:forEach>
                            </tbody>
                            </table>
                        </c:when>
                        <c:otherwise>
                            <center> <p>Favourite Properties you like to add them to this page<p></center>
                            </c:otherwise>
                        </c:choose>
                    </div>
                    <%@include file="/Footer.jsp"%>