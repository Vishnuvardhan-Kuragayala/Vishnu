<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="r" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<r:form action="searchLockerr" method="post" modelAttribute="searchlocker" >
<table>
<tr>
<r:input path="lockerId" name="search" required="true"/> 

<td>SearchByLockerId</td>
</tr>
<tr>
 <td><input type="submit" value="Search"/></td>
 </tr>
<forEach var="loc" items="${lockers}">
<tr>

<td>${loc.lockerId}</td>

</tr>
</forEach>
</table>
</r:form>
</body>
</html>