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

        <form action="updateCarDetails" method="post">
            <div class="row"> 

                <div class="col-md-4">
                    <label for="listingNumber">Listing number:</label><h4>${aCar.listingNumber}</h4><br>

                    <input type="text" id="listingNumber" name="listingNumber" value="${aCar.listingNumber}" hidden><br>

                    <label for="year">Year:</label><br>
                    <input type="text" id="year" name="year" value="${aCar.year}"><br>

                    <label for="reg">Reg:</label><br>
                    <input type="text" id="reg" name="reg" value="${aCar.reg}"><br>

                    <label for="make">Make:</label><br>
                    <input type="text" id="make" name="make" value="${aCar.make}"><br>

                    <label for="model">Model:</label><br>
                    <input type="text" id="model" name="model" value="${aCar.model}"><br>

                    <label for="colour">Colour:</label><br>
                    <input type="text" id="colour" name="colour" value="${aCar.colour}"><br>

                    <label for="buyPrice">Buy Price:</label><br>
                    <input type="text" id="buyPrice" name="buyPrice" value="${aCar.buyPrice}"><br>

                    <label for="listPrice">List Price:</label><br>
                    <input type="text" id="odometer" name="listPrice" value="${aCar.listPrice}"><br>

                    <label for="odometer">Odometer:</label><br>
                    <input type="text" id="odometer" name="odometer" value="${aCar.odometer}"><br>

                    <label for="kph">0-60kph:</label><br>
                    <input type="text" id="kph" name="kph" value="${aCar.kph}"><br>

                    <label for="description">Description:</label><br>
                    <textarea id="description" name="description"  rows="10" cols="30">${aCar.description}</textarea><br>

                </div>

                <div class="col-md-4">              

                    <br><br><br><br><br>
                    <label for="engine">Engine:</label><br>
                    <input type="text" id="engine" name="engine" value="${aCar.engine}"><br>

                    <label for="fuel">Fuel:</label><br>
                    <select name="fuel">
                        <option selected="selected">
                            ${aCar.fuel}
                        </option>
                        <option value="Diesel">Diesel</option>
                        <option value="Petrol">Petrol</option>
                        <option value="Hybrid">Hybrid</option>
                        <option value="Electric">Electric</option>
                    </select> <br>

                    <label for="transmission">Transmission :</label><br>
                    <select name="transmission">
                        <option selected="selected">
                            ${aCar.transmission}
                        </option>
                        <option value="Automatic">Automatic</option>
                        <option value="Manual">Manual</option>
                    </select> <br>

                    <label for="body">Body:</label><br>
                    <select name="body">
                        <option selected="selected">
                            ${aCar.body}
                        </option>
                        <option value="Hatchback">Hatchback</option>
                        <option value="SUV">SUV</option>
                        <option value="Saloon">Saloon</option>
                        <option value="MPV">MPV</option>
                        <option value="Coupe">Coupe</option>
                        <option value="Convertible">Convertible</option>
                    </select> <br>

                    <label for="isofix">Isofix:</label><br>
                    <select name="isofix">
                        <option selected="selected">
                            ${aCar.isofix}
                        </option>
                        <option value="Yes">Yes</option>
                        <option value="No">No</option>
                    </select> <br>

                    <label for="motorTax">MotorTax:</label><br>
                    <input type="text" id="motorTax" name="motorTax" value="${aCar.motorTax}"><br>

                    <label for="preOwnerNumber">Previous Owner Number:</label><br>
                    <input type="text" id="preOwnerNumber" name="preOwnerNumber" value="${aCar.preOwnerNumber}"><br>

                    <label for="salesPersonID">salesPersonID :</label><br>
                    <input type="text" id="salesPersonID" name="salesPersonID" value="${aCar.salesPersonID}"><br>

                    <label for="preOwnerID">preOwnerID :</label><br>
                    <input type="text" id="preOwnerID" name="preOwnerID" value="${aCar.preOwnerID}"><br>

                    <label for="fullServiceHistory">Service History :</label><br>

                    <select name="fullServiceHistory">
                        <option selected="selected">
                            ${aCar.fullServiceHistory}
                        </option>
                        <option value="Y">Y</option>
                        <option value="N">N</option>
                    </select> <br>

                    <label for="note">Note:</label><br>
                    <textarea id="note" name="note" rows="10" cols="30">${aCar.note}</textarea><br>
                </div>

                <div class="col-md-4">
                    <br><br><br><br>
                    <label for="Image">Image upload</label><br>
                    <input type="file" id="img" name="img" accept="Assets/*" multiple><br><br><br> 

                    <label for="reset">Click reset to default to DB Values</label><br>
                    <input type="reset"><br><br><br><br>
                    <hr>

                    <input type="submit" value="Submit" onclick="checkSubmit"><br> 
                </div>    


            </div>
        </form>
        <br>




    </div> 

    <div class="col-md-3">

    </div>
</div>

<br><br>
<%@include file="/Footer.jsp"%>