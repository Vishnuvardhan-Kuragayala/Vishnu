<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="r" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
#example1 {
  border: 2px solid black;
  padding: 382px;
  background: url('https://quicklinestorage.co.uk/wp-content/uploads/2016/05/Blog-Maximising-warehouse-space.jpg'), url(LOCKER.jpg);
  background-repeat: no-repeat;
  background-size: contain, cover;
}
</style>

<body><div id="example1">
<h1> Adds Locker</h1>
<r:form action="addLocOne" method="post" modelAttribute="log">
 <table>

 
 
  <tr>
 <td><strong>LockerId</strong></td>
 <td><r:input path="locker.lockerId" required="true"/></td>
 </tr>
 <tr>
 <td><strong>Locker capacity</strong></td>
 <td><r:input path="locker.capacity" required="true"/></td>
 </tr>
 <tr>
 <td><strong>LockerLog Requester name</strong></td>
 <td><r:input path="requester" required="true"/></td>
 </tr>
 <tr>
 <td><strong>LockerLog Description</strong></td>
 <td><r:input path="description" required="true"/></td>
 </tr>
 <tr>
 <td><strong>date</strong></td>
 <td><r:input path="date" required="true"/></td>
 </tr>
 
 <tr>
 <td><input type="submit" value="Add LockerLog"/></td>
 </tr>
 </table>
</r:form></div>
</body>
</html>