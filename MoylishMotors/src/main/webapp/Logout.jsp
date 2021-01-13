<%-- 
    Document   : Login
    Created on : 02-Nov-2020, 11:26:45
    Author     : Jonathan Roddy
--%>
<%@include file="/Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <!-- https://www.tutorialrepublic.com/snippets/preview.php?topic=bootstrap&file=elegant-modal-login-form-with-avatar-icon -->
        <!-- Modal HTML -->
        <center>
           <div id="myModal">
            <div class="modal-login">
                <div class="modal-content">
                    <div class="modal">
                        <div class="avatar">
                            <img src="Assets/avatar.png" alt="Avatar">
                        </div>	
                        <h4 class="modal-title">Member Login</h4>	
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <shiro:guest>
                        <p>
                            <c:if test="${shiroLoginFailure != null}">
                                Username or password incorrect
                            </c:if>

                        <div class="modal-body">

                            <form action="loginform" method="post">
                                <div class="form-group">
                                    <input type="text" class="form-control" name="username" placeholder="Username" required="required">		
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" name="password" placeholder="Password" required="required">	
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
                            <br>Visit the secret content<a href="secret/index.jsp"> here    </a>
                            <br><a href="/ShiroExample/logout">Logout</a>
                        </shiro:user>

                    </div>
                    <div class="modal-footer">
                        <a href="#">Forgot Password?</a>
                    </div>
                </div>
            </div>
        </div>   
        </center>
           

<%@include file="/Footer.jsp"%>
