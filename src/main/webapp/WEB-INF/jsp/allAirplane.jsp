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
                <form class="formDeleteAirplane" action="allAirplane/${airplane.idAirplane}" method="post">
                    <ul class="airplaneInfo">
                        <li id="jsonAirplane">${airplane.idAirplane}. ${airplane.name}  ${airplane.factorySerialNumber} ${airplane.numberOfFlight} ${airplane.flightDistance} ${airplane.fuelCapacity} ${airplane.type} ${airplane.createdAt}
                        </li>
                        <button class="delete">Delete airplanes</button>
                    </ul>
                </form>
                </c:forEach>
            </div>
    </div>
</div>
</body>
</html>