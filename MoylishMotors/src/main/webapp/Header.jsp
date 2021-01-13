<%-- 
    Document   : Header
    Created on : 02-Nov-2020, 11:27:01
    Author     : Jonathan Roddy
--%>

<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<style>
    body {
        font-family: 'Varela Round', sans-serif;
        background-color: #FDE7E2;
    }
    .modal-login {		
        color: #636363;
        width: 350px;
    }
    .modal-login .modal-content {
        padding: 20px;
        border-radius: 5px;
        border: none;
    }
    .modal-login .modal-header {
        border-bottom: none;   
        position: relative;
        justify-content: center;
    }
    .modal-login h4 {
        text-align: center;
        font-size: 26px;
        margin: 30px 0 -15px;
    }
    .modal-login .form-control:focus {
        border-color: #70c5c0;
    }
    .modal-login .form-control, .modal-login .btn {
        min-height: 40px;
        border-radius: 3px; 
    }
    .modal-login .close {
        position: absolute;
        top: -5px;
        right: -5px;
    }	
    .modal-login .modal-footer {
        background: #ecf0f1;
        border-color: #dee4e7;
        text-align: center;
        justify-content: center;
        margin: 0 -20px -20px;
        border-radius: 5px;
        font-size: 13px;
    }
    .modal-login .modal-footer a {
        color: #999;
    }		
    .modal-login .avatar {
        position: absolute;
        margin: 0 auto;
        left: 0;
        right: 0;
        top: -70px;
        width: 95px;
        height: 95px;
        border-radius: 50%;
        z-index: 9;
        background: #60c7c1;
        padding: 15px;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.1);
    }
    .modal-login .avatar img {
        width: 100%;
    }
    .modal-login.modal-dialog {
        margin-top: 80px;
    }
    .modal-login .btn, .modal-login .btn:active {
        color: #fff;
        border-radius: 4px;
        background: #60c7c1 !important;
        text-decoration: none;
        transition: all 0.4s;
        line-height: normal;
        border: none;
    }
    .modal-login .btn:hover, .modal-login .btn:focus {
        background: #45aba6 !important;
        outline: none;
    }
    .trigger-btn {
        display: inline-block;
        margin: 100px auto;
    }
    #CarTable{
        width:80%;
    }
    .card:hover {
        box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
    }
    .card h5 {
        font-style: italic;
    }
    .container {
        margin: 0 auto;
    }

    /* Float four columns side by side */
    .column {
        float: left;
        width: 25%;
        padding: 0 10px;
    }

    /* Remove extra left and right margins, due to padding */
    .cardRow {

        margin: auto;
        width: 60%;
        padding: 10px;
    }

    /* Clear floats after the columns */
    .cardRow:after {
        content: "";
        display: table;
        clear: both;
    }

    /* Responsive columns */
    @media screen and (max-width: 600px) {
        .column {
            width: 100%;
            display: block;
            margin-bottom: 20px;
        }
    }

    /* Style the counter cards */
    .card {
        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        padding: 16px;
        text-align: center;
    }
    .cardRow .card img{
        width:120px; 
        height: 120px;
        display: block;
        margin-left: auto;
        margin-right: auto;
    }

    .myCard{
        display: block;
        margin-left: auto;
        margin-right: auto;
    }
    .myCard img{
        width:240px; 
        height: 240px;
        display: block;
        margin-left: auto;
        margin-right: auto;
    }

    .wrapper {
        width: 80%;
        margin-top: 50px
    }

    @media(max-width:992px) {
        .wrapper {
            width: 100%
        }
    }

    .panel-heading {
        padding: 0;
        border: 0;
        padding: 9px 3px !important
    }

    .panel-title>a,
    .panel-title>a:active {
        display: block;
        padding: 10px;
        color: #555;
        font-size: 11px;
        text-transform: uppercase;
        letter-spacing: 1px;
        word-spacing: 3px;
        text-decoration: none
    }

    .panel-heading a:before {
        font-family: 'Glyphicons Halflings';
        content: "\e114";
        float: right;
        transition: all 0.5s
    }

    .panel-heading.active a:before {
        -webkit-transform: rotate(180deg);
        -moz-transform: rotate(180deg);
        transform: rotate(180deg)
    }

    .panel-default>.panel-heading {
        color: #282b2f;
        background-color: #ffffff !important;
        border-color: #d5d5d5
    }

    @keyframes click-wave {
        0% {
            height: 40px;
            width: 40px;
            opacity: 0.15;
            position: relative
        }

        100% {
            height: 200px;
            width: 200px;
            margin-left: -80px;
            margin-top: -80px;
            opacity: 0
        }
    }

    .option-input {
        -webkit-appearance: none;
        -moz-appearance: none;
        -ms-appearance: none;
        -o-appearance: none;
        appearance: none;
        position: relative;
        top: -8.66667px;
        right: 0;
        bottom: 0;
        left: 0;
        height: 24px;
        width: 24px;
        transition: all 0.15s ease-out 0s;
        background: #cbd1d8;
        border: none;
        color: #fff;
        cursor: pointer;
        display: inline-block;
        margin-right: 0.5rem;
        outline: none;
        position: relative;
        z-index: 1000
    }

    .option-input:hover {
        background: #9faab7
    }

    .option-input:checked {
        background: #2874ef
    }

    .option-input:checked::before {
        height: 24px;
        width: 24px;
        position: absolute;
        content: "\f111";
        font-family: "Font Awesome 5 Free";
        display: inline-block;
        font-size: 14.66667px;
        text-align: center;
        line-height: 26px
    }

    .option-input:checked::after {
        -webkit-animation: click-wave 0.15s;
        -moz-animation: click-wave 0.15s;
        animation: click-wave 0.15s;
        background: #E91E63;
        content: '';
        display: block;
        position: relative;
        z-index: 100
    }

    .option-input.radio {
        border-radius: 50%
    }

    .option-input.radio::after {
        border-radius: 50%
    }

    .checkbox input[type="checkbox"],
    .checkbox-inline input[type="checkbox"] {
        float: left;
        margin-left: -4px !important;
        margin-top: 9px
    }

    input[type="checkbox"]:focus {
        outline: thin dotted #333;
        outline: 0px auto -webkit-focus-ring-color;
        outline-offset: 0px
    }

    .ml-10 {
        margin-left: 10px;
        font-size: 12px;
        color: #080808
    }

    .btn.btn-out {
        outline: 1px solid #fff;
        outline-offset: -5px
    }

    .btn {
        border-radius: 2px;
        text-transform: capitalize;
        font-size: 11px;
        padding: 10px 19px;
        cursor: pointer;
        color: #fff
    }

    .fa {
        font-size: 12px;
        color: #2874ef
    }

    .refine {
        padding: 0px 0px !important
    }

    .filters-text {
        background: #fff;
        border: 1px solid #d5d5d5;
        margin-bottom: 15px;
        padding: 12px
    }

    .filter-span {
        font-size: 17px;
        color: #2874ef
    }



</style>


<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link href="../../dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="signin.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Karla:400,700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.materialdesignicons.com/4.8.95/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/login.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="/path/to/cdn/bootstrap.min.css"> <script src="/path/to/cdn/jquery.slim.min.js"></script> <script src="/path/to/cdn/bootstrap.min.js"></script> 
        <link rel="stylesheet" href="./src/cookie-banner.css"> <script async="" src="./src/cookie-banner.js"></script>

        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">

        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>


        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">

        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>

<!--<meta http-equiv="content-type"
content="text/html;charset=latin1_swedish_ci">-->
        <title>JSP Page</title>
    </head>

    <header>
        <!-- https://getbootstrap.com/docs/4.1/components/navbar/ -->
        <background-image: url('http://upload.wikimedia.org/wikipedia/commons/6/6b/Bubble_3.jpg');>
            <nav class="navbar navbar-expand-lg navbar-dark bg-secondary" >

                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                

                <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                    <a class="navbar-brand" href="index.jsp">Moylish Motors</a>
                    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                        <li class="nav-item active">
                            <a class="nav-link" href="DisplayAllCars">Our Cars <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="DisplayAllVendors">Meet our Team</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="BookATestDrive.jsp">Book a Test Drive</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="ContactUs.jsp">Contact us</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Favourites.jsp">My Favourites</a>
                        </li>

<!--                        <li class="nav-item">
                            <a class="nav-link " href="Acount.jsp">Acount</a>
                        </li>-->
                        <shiro:hasAnyRoles name = "admin">
                            <li class="nav-item">
                                <a class="nav-link " href="adminPage">Admin Page</a>
                            </li>
                        </shiro:hasAnyRoles>
                        <li class="nav-item">
                            <a class="nav-link " href="Login.jsp">Login</a>
                        </li>


                    </ul>
                </div>
            </nav>


    </header>

    <body>  

