<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="r" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Add.......Item</h1>
<r:form action="addLoc" method="post" modelAttribute="locker">
 <table>
 <%-- <tr>
 <td>Item Id</td>
 <td><r:input path="item.id" required="true"/></td>
 </tr>
 <tr>
 <td>item name</td>
 <td><r:input path="item.name" required="true"/></td>
 </tr>
 <tr>
 <td>Item batchNumber</td>
 <td><r:input path="item.batchNumber" required="true"/></td>
 </tr> --%>
 <tr>
 <td>Locker Id</td>
 <td><r:input path="lockerId" required="true"/></td>
 </tr>
 <tr>
 <td>Locker capacity</td>
 <td><r:input path="capacity" required="true"/></td>
 </tr>
 
 <tr>
 <td><input type="submit" value="Add Product"/></td>
 </tr>
 </table>
</r:form>
</body>
</html>