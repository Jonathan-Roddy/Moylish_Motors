<%-- 
    Document   : ContactUs
    Created on : 15-Nov-2020, 14:50:21
    Author     : Jonathan Roddy
--%>
<%@include file="/Header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<script>
    function showEmailMessage() {
        if (confirm("Your email has been sent. A member of staff will reply shortly"))
            return true;
        else
            return false;
    }

</script>

<br>

<div class="container">
    <div class="col-md-12">
        <div class="well well-sm">
            
            
            <form class="form-horizontal" action="mail" method="post" >
                <fieldset>
                    <legend class="text-center">Contact us</legend>

                    <!-- Name input-->
                    <div class="form-group">
                        <label class="col-md-3 control-label" for="name">Name</label>
                        <div class="col-md-12">
                            <input id="name" name="name" type="text" placeholder="Your name" class="form-control" required>
                        </div>
                    </div>

                    <!-- Email input-->
                    <div class="form-group">
                        <label class="col-md-3 control-label" for="email">Your E-mail</label>
                        <div class="col-md-12">
                            <input id="email" name="email" type="text" placeholder="Your email" class="form-control" required>
                        </div>
                    </div>

                    <!-- Message body -->
                    <div class="form-group">
                        <label class="col-md-3 control-label" for="message">Your message</label>
                        <div class="col-md-12">
                            <textarea class="form-control" id="message" name="message" placeholder="Please enter your message here..." rows="5" required></textarea>
                        </div>
                    </div>

                    <!-- Form actions -->
                    <div class="form-group">
                        <div class="col-md-12 text-right">
                            <button type="submit" class="btn btn-primary btn-lg" onclick="showEmailMessage()" >Submit</button>
                        </div>
                    </div>
                </fieldset>
            </form>
            
            
        </div>
    </div>
</div>
<br>
<%@include file="/Footer.jsp"%>
