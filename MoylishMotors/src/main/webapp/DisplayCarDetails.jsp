<%-- 
    Document   : DisplayAllCars
    Created on : 02-Nov-2020, 11:27:26
    Author     : Jonathan Roddy
--%>
<%@include file="/Header.jsp"%>
<%@page import="Controller.DisplayCarDetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
    var folder = "Assets/Stock/Large/${aCar.listingNumber}/";

    $.ajax({
        url: folder,
        success: function (data) {
            $(data).find("a").attr("href", function (i, val) {
                if (val.match(/\.(jpe?g|png|gif)$/)) {
                    $("body").append("<img src='" + folder + val + "'>");
                }
            });
        }
    });

    $(document).ready(function () {
        $('#dtDynamicVerticalScrollExample').DataTable({
            "scrollY": "50vh",
            "scrollCollapse": true,
        });
    });
    
    
</script> 

<br><br>
<div class="row"> 

    <div class="col-md-1">

    </div>
    <div class="col-md-9">
        <div class="row">
            <div class="col-md-8">
                <!-- Images  -->
                <br>
                <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}.JPG" alt="First slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}-1.JPG" alt="Second slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}-2.JPG" alt="Third slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}-3.JPG" alt="Fourth slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}-4.JPG" alt="Third slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}-5.JPG" alt="Third slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}-6.JPG" alt="Second slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}-7.JPG" alt="Third slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}-8.JPG" alt="Third slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}-9.JPG" alt="Third slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}-10.JPG" alt="Second slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="Assets/Stock/Large/${aCar.listingNumber}/${aCar.listingNumber}-11.JPG" alt="Third slide">
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>

            <div class="col-md-4">    
                <c:choose>
                    <c:when test="${!carInfavourites}">
                        <div class="info">
                            <form action="AddToFavourites?propertyId=${aCar.listingNumber}" method="post">
                                <input type="Submit" value="Add to Favourites"/>
                            </form>
                        </div>        
                    </c:when>
                    <c:otherwise>
                        <div class="info">
                            <form action="RemoveFromFavourites?propertyId=${aCar.listingNumber}" method="post">
                                <input type="Submit" value="Delete from Favourites"/>
                            </form>
                        </div> 
                    </c:otherwise>
                </c:choose>
                <table class="table table-striped table-bordered table-sm" id="dtDynamicVerticalScrollExample" >
                    <tbody>
                        <tr> <td><h5>Listing number:</h5>${aCar.listingNumber}</h5></td></tr>
                        <tr> <td><h5>Year:</h5><p>${aCar.year}</p><h5>Reg:</h5><p>${aCar.reg}</p></td></tr>
                        <tr> <td><h5>Make:</h5><p>${aCar.make}</p> <h5>Model:</h5><p>${aCar.model}</p></td></tr>
                        <tr> <td><h5>Colour:</h5><p>${aCar.colour}</p></td></tr>
                        <tr> <td><h5>Description:</h5><p>${aCar.description}</p></td></tr>
                        <tr> <td><h5>Buy Price:</h5><p>Buy Price: ${aCar.buyPrice}</p></td></tr>
                        <tr> <td><h5>List Price:</h5><p>${aCar.listPrice}</p></td></tr>
                        <tr> <td><h5>Odometer:</h5><p>${aCar.odometer}</p></td></tr>
                        <tr> <td><h5>0-60kph:</h5><p>${aCar.kph}</p></td></tr>
                        <tr> <td><h5>Engine:</h5><p>${aCar.engine}</p></td></tr>
                        <tr> <td><h5>Fuel:</h5><p>${aCar.fuel}</p></td></tr>
                        <tr> <td><h5>Transmission :</h5><p>${aCar.transmission}</p></td></tr>
                        <tr> <td><h5>Body:</h5><p>Body: ${aCar.body}</p></td></tr>
                        <tr> <td><h5>Isofix:</h5><p>${aCar.isofix}</p></td></tr>
                        <tr> <td><h5>MotorTax:</h5><p>${aCar.motorTax}</p></td></tr>
                        <tr> <td><h5>Previous Owner Number:</h5><p>${aCar.preOwnerNumber}</p></td></tr>
                        <tr> <td><h5>Service History:</h5><p>${aCar.fullServiceHistory}</p></td></tr>
                        <tr> <td><h5>Note:</h5><p>${aCar.note}</p></tr>
                    </tbody>
                </table>
                <br>
            </div>        

        </div>

    </div> 

    <div class="col-md-2">
        <table>
            <tr> <td><h5>salesPersonID:</h5><p>${aCar.salesPersonID}</p></td></tr>
            <tr> <td><h5>preOwnerID:</h5><p>${aCar.preOwnerID}</p></td></tr>
        </table>
    </div>
</div>


<%@include file="/Footer.jsp"%>