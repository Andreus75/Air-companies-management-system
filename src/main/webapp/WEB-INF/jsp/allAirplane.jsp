<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>home</title>
    <link rel="stylesheet"  type="text/css" href="../styles/main.css">
</head>
<body>
<p>Air management</p>
<div class="airplane">
    <div>

            <div class="findAllAirplanes">
                <h2>List Airplanes</h2>
                <c:forEach items="${airplanes}" var="airplane">
                <form class="formDeleteAirplane" action="allAirplane/deleteAirplane/{idAirplane}" method="delete">
                    <ul class="airplaneInfo">
                        <li id="jsonAirplane">${airplane.idAirplane}. ${airplane.name}  ${airplane.factorySerialNumber} ${airplane.numberOfFlight} ${airplane.flightDistance} ${airplane.fuelCapacity} ${airplane.type} ${airplane.createdAt}
                        </li>
                        <a href="/allAirplane/deleteAirplane/${airplane.idAirplane}">delete</a>
                    </ul>
                </form>
                </c:forEach>


<%--                    <input id="idAirplane" type="number" name="idAirplane" placeholder="idAirplane">--%>
<%--                        <button class="delete">Delete airplanes</button>--%>

            </div>

    </div>
<%--<script>--%>
<%--    $('formDeleteAirplane').onclick(function (e) {--%>
<%--        e.preventDefault();--%>
<%--        let frm = $("#jsonAirplane");--%>
<%--        console.log(frm);--%>
<%--        let dat = frm.serialize();--%>
<%--        $.ajax({--%>
<%--            type: 'DELETE',--%>
<%--            url: $('#formDeleteAirplane').attr('action'),--%>
<%--            data: dat,--%>
<%--            contentType: 'application/json'--%>
<%--            success: function (hxr) {--%>
<%--                alert("Success: "  + hxr);--%>
<%--            }--%>
<%--        })--%>
<%--    })--%>
<%--</script>--%>
</div>
</body>
</html>