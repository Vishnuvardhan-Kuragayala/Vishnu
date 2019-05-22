<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>

<td>Batch Number</td>
<td>Locker Id</td>
<td>Item Name</td>
</tr>
<d:forEach var="item" items="${items}">
<tr>

<td>${item.batchNumber}</td>
<td>${item.locker.lockerId}</td>
<td>${item.name}</td>
</tr>
</d:forEach>
</table>


</body>
</html>