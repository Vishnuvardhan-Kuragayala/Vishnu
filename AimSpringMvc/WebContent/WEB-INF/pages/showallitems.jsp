<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head><style>
#example1 {
  border: 2px solid black;
  padding: 360px;
  background: url('https://zgg9ek4mn42tbgiz-zippykid.netdna-ssl.com/wp-content/uploads/2014/10/urbandev-industrial-warehouse-The-Registry-real-estate.jpg'), url(mountain.jpg);
  background-repeat: no-repeat;
  background-size: contain, cover;
}

</style>
<h1>INVENTORY MANAGEMENT SYSTEM</h1>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<div id="example1">

<table>
<tr>

<td><strong>Batch Number</strong></td>
<td><strong>Locker Id</strong></td>
<td><strong>Item Name</strong></td>
</tr>
<d:forEach var="item" items="${items}">
<tr>

<td>${item.batchNumber}</td>
<td>${item.locker.lockerId}</td>
<td>${item.name}</td>
</tr>
</d:forEach>
</table>
</div>

</body>
</html>