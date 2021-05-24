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
<div class="flight">
<%--    <form class="form_all" action="allFlight" method="get" enctype="multipart/form-data">--%>
        <div class="findAllFlight">
            <h2>List Flight</h2>
            <c:forEach items="${flights}" var="flight">
                <form class="formDeleteFlight" action="allFlights/${flight.idFlight}" method="post">
                    <ul class="flightInfo">
                        <li>${flight.idFlight}. ${flight.flightStatus}  ${flight.departureCountry} ${flight.destinationCountry} ${flight.distance} ${flight.estimatedFlightTime} ${flight.endedAt} ${flight.delayStarted} ${flight.createAt}
                        </li>
                        <button name="deleteFlight" class="button">Delete flight</button>
                    </ul>
                </form>

            </c:forEach>
        </div>
<%--    </form>--%>
</div>
</body>
</html>