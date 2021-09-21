<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Stocks</title>
</head>
<body>


<h2>All Stocks</h2>

<br>
<table>
    <tr>
        <th>Ticker</th>
        <th>Name</th>
        <th>Price</th>
<%--        <th>Currency</th>--%>
        <th>Dividend</th>
        <th>Country</th>
        <th>Count</th>
    </tr>
    <c:forEach var="stockStorage" items="${stocks}">
        <tr>
            <td>${stockStorage.ticker}</td>
            <td>${stockStorage.name}</td>
            <td>${stockStorage.price}</td>
<%--            <td>${stock.currency.ticker}</td>--%>
            <td>${stockStorage.dividend}</td>
            <td>${stockStorage.country}</td>
            <td>${stockStorage.count}</td>
        </tr>
    </c:forEach>
</table>

<h2>${stock.name}</h2>
<h2>${stock.currency.ticker}</h2>

</body>
</html>
