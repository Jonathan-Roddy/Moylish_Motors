<%-- 
    Document   : adminPage
    Created on : 23-Nov-2020, 12:44:13
    Author     : Jonathan Roddy
--%>
<%@include file="/Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<br><br>

<div class="row">

    <div class="col-md-1">

    </div>

    <div class="col-md-3">
        <h4>User Details</h4> 
        <table class="table table-striped table-bordered table-sm" id="dtDynamicVerticalScrollExample" >
            <tbody>
                <tr> <td><h5>Number of Users </h5>${userCount}</td></tr>
                <tr> <td><a href="DisplayAllUsers">ViewAllUsers</a></td></tr>
            </tbody>
        </table>
    </div>

    <div class="col-md-3">
        <h4>Car Details</h4>
        <table class="table table-striped table-bordered table-sm" id="dtDynamicVerticalScrollExample" >
            <tbody>
                <tr> <td><h5>Number of Cars in stock</h5>${carCount}</td></tr>
                <tr> <td><a href="DisplayAllCars">ViewAllCars</a></td></tr>
                <tr> <td><a href="addCarToDB.jsp">AddCars</a></td></tr>
            </tbody>
        </table>
    </div>
    <div class="col-md-3">
        <h4>Vendor Details</h4>
        <table class="table table-striped table-bordered table-sm" id="dtDynamicVerticalScrollExample" >
            <tbody>
                <tr> <td><h5>Number of Vendors</h5>${vendorCount}</td></tr>
                <tr> <td><a href="DisplayAllVendors">ViewAllVendors</a></td></tr>
            </tbody>
        </table>
    </div>

    <div class="col-md-2">
        <h4>download StockFile</h4>
        <a href="Sales_Stock.csv">View our Stock file</a>
        <br><br>
        <a href="downloadFile?name=Sales_Stock.csv">Download out policy here</a>
        <br><br>
        <a href="downloadCars.jsp">Download our full car stock from DB</a>
    </div>

</div>
<br><br>
<br><br>

<%@include file="/Footer.jsp"%>