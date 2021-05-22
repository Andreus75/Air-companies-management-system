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
<div class="airCompany">
    <form class="form_all" action="allAirCompany" method="get" enctype="multipart/form-data">
        <div class="findAllAirCompany">
            <h2>List AirCompany</h2>
            <c:forEach items="${airCompanies}" var="airCompany">
                <ul class="airCompanyInfo">
                    <li>${airCompany.idCompany}. ${airCompany.nameCompany}  ${airCompany.companyType} ${airCompany.foundedAt}
                    </li>
                    <button name="deleteAirCompany" class="button">Delete airCompany</button>
                </ul>
            </c:forEach>
        </div>
    </form>
</div>
</body>
</html>