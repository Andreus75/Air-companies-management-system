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
    <div class="addAirplane">
        <form class="form_add" action="addAirplane" method="post" enctype="multipart/form-data">
            <label for="name">nameAirplane</label>
            <input id="name" type="text" name="name" placeholder="name">
            <br/><br/>
            <label for="factorySerialNumber">factorySerialNumber</label>
            <input id="factorySerialNumber" type="text" name="factorySerialNumber" placeholder="factorySerialNumber">
            <br/><br/>
            <label for="numberOfFlight">numberOfFlight</label>
            <input id="numberOfFlight" type="text" name="numberOfFlight" placeholder="numberOfFlight">
            <br/><br/>
            <label for="flightDistance">flightDistance</label>
            <input id="flightDistance" type="text" name="flightDistance" placeholder="flightDistance">
            <br/><br/>
            <label for="fuelCapacity">fuelCapacity</label>
            <input id="fuelCapacity" type="text" name="fuelCapacity" placeholder="fuelCapacity">
            <br/><br/>
            <label for="type">type</label>
            <input id="type" type="text" name="type" placeholder="type">
            <br/><br/>
            <label for="createdAt">createdAt</label>
            <input id="createdAt" type="date" name="createdAt" placeholder="createdAt">
            <br/><br/>
            <button class="add">addAirplane</button>
        </form>
        <form class="form_all" action="allAirplane" method="get" enctype="multipart/form-data">
            <button class="all">AllAirplan</button>
        </form>
    </div>
</div>

<div class="airCompany">
    <form class="form_action" action="addAirCompany" method="post" enctype="multipart/form-data">
        <label for="nameCompany">nameCompany</label>
        <input id="nameCompany" type="text" name="nameCompany" placeholder="nameCompany">
        <br/><br/>
        <label for="companyType">companyType</label>
        <input id="companyType" type="text" name="companyType" placeholder="companyType">
        <br/><br/>
        <label for="foundedAt">foundedAt</label>
        <input id="foundedAt" type="date" name="foundedAt" placeholder="foundedAt">
        <br/><br/>
        <button class="add">addAirCompany</button>
    </form>
    <form class="form_all" action="allAirCompanies" method="get" enctype="multipart/form-data">
        <button class="all">AllAirCompanies</button>
    </form>
</div>

<div class="flight">
    <form class="form_action" action="addAFlight" method="post" enctype="multipart/form-data">
        <label for="flightStatus">flightStatus</label>
        <input id="flightStatus" type="text" name="flightStatus" placeholder="flightStatus">
        <br/><br/>
        <label for="departureCountry">departureCountry</label>
        <input id="departureCountry" type="text" name="departureCountry" placeholder="departureCountry">
        <br/><br/>
        <label for="destinationCountry">destinationCountry</label>
        <input id="destinationCountry" type="text" name="destinationCountry" placeholder="destinationCountry">
        <br/><br/>
        <label for="distance">distance</label>
        <input id="distance" type="text" name="distance" placeholder="distance">
        <br/><br/>
        <label for="estimatedFlightTime">estimatedFlightTime</label>
        <input id="estimatedFlightTime" type="text" name="estimatedFlightTime" placeholder="estimatedFlightTime">
        <br/><br/>
        <label for="endedAt">endedAt</label>
        <input id="endedAt" type="date" name="endedAt" placeholder="endedAt">
        <br/><br/>
        <label for="delayStarted">delayStarted</label>
        <input id="delayStarted" type="text" name="delayStarted" placeholder="delayStarted">
        <br/><br/>
        <label for="createAt">createAt</label>
        <input id="createAt" type="date" name="createAt" placeholder="createAt">
        <br/><br/>
        <button class="add">addFlight</button>
    </form>
    <form class="form_all" action="allFlight" method="get" enctype="multipart/form-data">
        <button class="all">AllFlight</button>
    </form>
</div>
</body>
</html>