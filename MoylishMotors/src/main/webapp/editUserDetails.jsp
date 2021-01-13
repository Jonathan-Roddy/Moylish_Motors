<%-- 
    Document   : editCarDetails
    Created on : 30-Nov-2020, 10:50:56
    Author     : Jonathan Roddy
--%>
<%@include file="/Header.jsp"%>
<%@page import="Controller.editCarDetails"%>
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

    function checkSubmit() {
        if (confirm("Are you sure you want to save this record?"))
            return true;
        else
            return false;
    }


</script> 

<br><br>
<div class="row"> 

    <div class="col-md-3">

    </div>

    <div class="col-md-6">

        <form action="updateUserDetails" method="post">
            <div class="row"> 

                <div class="col-md-4">
                    <label for="listingNumber">ID :</label><h4>${aUser.id}</h4><br>

                    <input type="text" id="id" name="id" value="${aUser.id}" hidden><br>

                    <label for="year">Username</label><br>
                    <input type="text" id="username" name="year" value="${aCar.username}"><br>

                    <label for="reg">Password</label><br>
                    <input type="text" id="password" name="reg" value="${aCar.password}"><br>

                    <label for="make">User Type</label><br>
                    <input type="text" id="userType" name="make" value="${aCar.userType}"><br>
                    <select name="fuel">
                        <option selected="selected">
                            ${aCar.userType}
                        </option>
                        <option value="Admin">Admin</option>
                        <option value="Customer">Customer</option>
                        <option value="Vendor">Vendor</option>
                    </select> <br>


                </div>


                <label for="reset">Click reset values</label><br>
                <input type="reset"><br><br><br><br>
                <hr>

                <input type="submit" value="Submit" onclick="checkSubmit"><br> 
            </div>    

        </form>
    </div>

    <div class="col-md-3">

    </div>
</div>

<br><br>
<%@include file="/Footer.jsp"%>