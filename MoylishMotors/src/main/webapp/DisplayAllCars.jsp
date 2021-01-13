<%-- 
    Document   : DisplayAllCars
    Created on : 02-Nov-2020, 11:27:26
    Author     : Jonathan Roddy
--%>
<%@include file="/Header.jsp"%>
<%@page import="Controller.DisplayAllCars"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
    $(document).ready(function () {
        $('#CarTable').DataTable({
            "pagingType": "numbers"
        });
    });

    var table = $('#CarTable').DataTable();

// #myInput is a <input type="text"> element
    $('#btn btn-out btn-primary btn-square').on('keyup', function () {
        table.search(this.value).draw();
    });

    function checkDelete() {
        if (confirm("Are you sure you want to delete this record?"))
            return true;
        else
            return false;
    }

</script>

<br><br><br><br>
<div class="row">
    <!-- Left Hand Side (LHS) content panel --> 
    <div class="col-md-2" >
        <div class="wrapper">
            <div class="filters-text">
                <span class="filter-span">Filters</span>
                <span style="float:right;"><i class="fa fa-filter"></i></span>
            </div>
            <!-- 
                Refine search
                Body : Hatchback, SUV, Saloon, MPV, Coupe, Convertible
                Year : 2020, 2019, 2016, 2018, 2014, 2013, 2015, 2017, 2010, 2006, 2007
                Model : Opel, Hyundair, Toyota, Volvo, Peugeot, Volkswagen, Ford, Nissan, Renault,  Dacia, Audo, BMW, Mercedes-Benz, Jaguar, Mazda, Land Rover , Audi , Skoda , SEAT, Lexus, Aston Martin

                Colour : Black, Grey, Slate, Sky Blue, Dark Grey, Charcoal, White, Silver, Cherry, Brown, Metallic Eiger Grey, Red, Bronze, Blue, Pearl Red
            

            <select class="mdb-select md-form" searchable="Search here..">
                <option value="" disabled selected>Choose your country</option>
                <option value="1">USA</option>
                <option value="2">Germany</option>
                <option value="3">France</option>
                <option value="3">Poland</option>
                <option value="3">Japan</option>
            
            <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="heading1">
                        <h4 class="panel-title"> <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapse1" aria-expanded="false" aria-controls="collapse1">Body
                            </a> </h4>
                    </div>

                    <div id="collapse1" class="panel-collapse collapse" role="tabpanel" aria-labelledby="heading1">
                        <div class="panel-body">
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="Convertible" /> <span class="ml-10">Convertible</span> </label> </div>
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="Coupe" /> <span class="ml-10">Coupe</span> </label> </div>
                        </div>
                    </div>
                </div>


                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="heading2">
                        <h4 class="panel-title"> <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapse2" aria-expanded="false" aria-controls="collapse2"> Brand </a> </h4>
                    </div>
                    <div id="collapse2" class="panel-collapse collapse" role="tabpanel" aria-labelledby="heading2">
                        <div class="panel-body">
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="12" /> <span class="ml-10">APPLE</span> </label> </div>
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="12" /> <span class="ml-10">DELL</span> </label> </div>
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="12" /> <span class="ml-10">HP</span> </label> </div>
                        </div>
                    </div>
                </div>


                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="heading3">
                        <h4 class="panel-title"> <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapse3" aria-expanded="false" aria-controls="collapse3"> Screen Size </a> </h4>
                    </div>
                    <div id="collapse3" class="panel-collapse collapse" role="tabpanel" aria-labelledby="heading3">
                        <div class="panel-body">
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="12" /> <span class="ml-10">BELOW 12.9 INCH</span> </label> </div>
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="12" /> <span class="ml-10">12 INCH - 12.9 INCH</span> </label> </div>
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="12" /> <span class="ml-10">13 INCH - 13.9 INCH</span> </label> </div>
                        </div>
                    </div>
                </div>


                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="heading4">
                        <h4 class="panel-title"> <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapse4" aria-expanded="false" aria-controls="collapse4"> Operating System </a> </h4>
                    </div>
                    <div id="collapse4" class="panel-collapse collapse" role="tabpanel" aria-labelledby="heading4">
                        <div class="panel-body">
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="12" /> <span class="ml-10">Windows 7</span> </label> </div>
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="12" /> <span class="ml-10">windows 8</span> </label> </div>
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="12" /> <span class="ml-10">Windows 10</span> </label> </div>
                            <div class="checkbox"> <label> <input type="checkbox" class="option-input checkbox" name="filter[]" value="12" /> <span class="ml-10">MAC OS</span> </label> </div>
                        </div>
                    </div>
                </div>


            </div>
            

            <div class="text-right refine"> 
                <button class="btn btn-out btn-primary btn-square" id="button-filter">Refine Search</button> 
            </div>-->


        </div>
    </div>

    <!--Right Hand Side (RHS) content panel--> 
    <div class="col-md-8" >
        <div class="row justify-content-center">
            <shiro:principal/>
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
                            <shiro:hasAnyRoles name = "admin">
                            <th scope="col">Actions</th>
                            </shiro:hasAnyRoles>


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
                            <shiro:hasAnyRoles name = "admin">
                                <td>
                                    <a href="editCarDetails?listingNumber=${aCars.listingNumber}">Edit</a>                                
                                    <a href="deleteCarFromDB?listingNumber=${aCars.listingNumber}" onclick="checkDelete()">Delete</a>
                                </td>
                                </shiro:hasAnyRoles>
                        </tr>

                    </c:forEach> 


                </tbody> 
            </table>
        </div>
    </div>


    <div class="col-md-2" >

    </div>
</div>

<br><br><br><br>
<%@include file="/Footer.jsp"%>