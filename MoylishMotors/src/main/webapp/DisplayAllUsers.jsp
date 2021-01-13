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
    <div class="col-md-2" >

    </div>

    <!--Right Hand Side (RHS) content panel--> 
    <div class="col-md-8" >
        <div class="row justify-content-center">
            
            <table class="table table-hover" id="CarTable">
                <thead class="thead-light">
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Username</th>
<!--                        <th scope="col">Password</th>-->
                        <th scope="col">UserType</th>
                        <th scope="col">Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${list}" var="aUser">
                        <tr>
                            <td>${aUser.id}</td>
                            <td>${aUser.username}</td>
<!--                            <td>${aUser.password}</td>-->
                            <td>${aUser.userType}</td>
                            <shiro:hasAnyRoles name = "admin">
                                <td>
                                    <a href="editUserDetails?id=${aUser.id}">Edit</a>                                
                                    <a href="deleteUserFromDB?id=${aUser.id}" onclick="checkDelete()">Delete</a>
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