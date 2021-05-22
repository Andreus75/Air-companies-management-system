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
    <form class="form_all" action="allAirplane" method="get" enctype="multipart/form-data">
        <div class="findAllAirplanes">
            <h2>List Airplanes</h2>
            <c:forEach items="${airplanes}" var="airplane">
                <form class="deleteAirplane" action="deleteAirplane" method="delete" enctype="multipart/form-data">
                    <ul class="airplaneInfo">
                        <li>${airplane.idAirplane}. ${airplane.name}  ${airplane.factorySerialNumber} ${airplane.numberOfFlight} ${airplane.flightDistance} ${airplane.fuelCapacity} ${airplane.type} ${airplane.createdAt}
                        </li>
                        <button name="deleteAirplanes" class="button">Delete airplanes</button>
                    </ul>
                </form>

            </c:forEach>
        </div>
    </form>
</div>
</body>
</html>