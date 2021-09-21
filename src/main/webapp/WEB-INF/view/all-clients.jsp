<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Clients</title>
    <%@ include file="header.jsp"%>
</head>
<body>

<h2>All clients</h2>
<br>
<table border="1">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Citizenship</th>
        <th>Birthday</th>
        <th>Passport Code</th>
        <th>Phone Number</th>
        <th>Email</th>
    </tr>
    <c:forEach var="client" items="${allClients}">
        <tr>
            <td>${client.detail.firstName}</td>
            <td>${client.detail.lastName}</td>
            <td>${client.detail.citizenship}</td>
            <td>${client.detail.birthday}</td>
            <td>${client.detail.passportCode}</td>
            <td>${client.detail.phoneNumber}</td>
            <td>${client.email}</td>
        </tr>
    </c:forEach>
</table>

<br>

<h2>${client.detail.firstName}</h2>

<br>

<button type="button" class="btn-outline-danger">Show All Stocks</button>

</body>
</html>
