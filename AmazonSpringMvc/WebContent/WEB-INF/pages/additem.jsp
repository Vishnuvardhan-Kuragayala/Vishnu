<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="r" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix ="c" uri = "http://www.springframework.org/tags/form" %>
        <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>INVENTORY MANAGEMENT</h1>
</center>
<html>
<head>
<style>
#example1 {
  border: 2px solid black;
  padding: 240px;
  background: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHLRiCJpVu-AAVTTkTHybr2H4VU4ohKEpkwcXzwaHnyRtXebzx'), url(mountain.jpg);
  background-repeat: no-repeat;
  background-size: contain, cover;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Item</title>
</head>
<body>
<div id="example1">
<h1> Add Item</h1>
<r:form action="itemadd" method="post" modelAttribute="item">
 <table>
 <tr>
 <td>Item Id</td>
 <td><r:input path="Id" required="true"/></td>
 </tr>
 <tr>
 <td>item name</td>
 <td><r:input path="name" required="true"/></td>
 </tr>
 <tr>
 <td>Item batchNumber</td>
 <td><r:input path="batchNumber" required="true"/></td>
 </tr> 
<tr>
 <td>Locker Id:</td>
 <td><input name="lid" required="true"/></td>
 </tr> 
 
 <tr>
 <td><input type="submit" value="Add Item"/></td>
 </tr>
 </table>
</r:form></div>
</body>
</html>