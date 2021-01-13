<%-- 
    Document   : Login
    Created on : 02-Nov-2020, 11:26:45
    Author     : Jonathan Roddy
--%>
<%@include file="/Header.jsp"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <!-- https://www.tutorialrepublic.com/snippets/preview.php?topic=bootstrap&file=elegant-modal-login-form-with-avatar-icon -->
        <!-- Modal HTML -->
        <div class="row">
            <div class="col-md-4">
            </div>
            <div class="col-md-4">
             <center style="align-content: center">
                <shiro:guest>
                    <p> 
                    <h2>Login Page</h2>
                        <p>
                        <c:if test="${shiroLoginFailure != null}">
                                Username or password incorrect
                        </c:if>

                        <div class="modal-body">

                            <form name="LoginForm" action="login" method="post">
                                <div class="form-group">
                                    <input type="text" id="username" class="form-control" name="username" placeholder="Username" required="required">		
                                </div>
                                <div class="form-group">
                                    <input type="password" id="password" class="form-control" name="password" placeholder="Password" required="required">	
                                </div>        
                                <div class="form-group">
                                    <button type="submit" class="btn btn-primary btn-lg btn-block login-btn">Login</button>
                                </div>
                            </form>
                            <br/>
                            <label for="rememberMe">Remember me:</label>
                            <input type="checkbox" id="rememberMe" name="rememberMe" value="true" />
                            <br/>


                        </shiro:guest>  
                        <shiro:user>
                            You are already logged in
                            <br><a href="logout">Logout</a>
                        </shiro:user>

                    </div>
                    <div class="modal-footer">
                        <a href="#">Forgot Password?</a>
                    </div>
                
        </center>
              
            </div>
            <div class="col-md-4">
            </div>
        </div>
        

 <%@include file="/Footer.jsp"%>
