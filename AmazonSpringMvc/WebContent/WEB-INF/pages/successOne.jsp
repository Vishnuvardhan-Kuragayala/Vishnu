   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><style>
#example1 {
  border: 2px solid black;
  padding: 450px;
  background: url('https://thumbs.dreamstime.com/z/happy-man-showing-thumbs-up-gesture-warehouse-wholesale-logistic-people-export-concept-reflective-safety-vest-65771824.jpg'), url(mountain.jpg);
  background-repeat: no-repeat;
  background-size: contain, cover;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><div id="example1"><div class="container" ><p class="text-left">
<%-- Added lockerLog Id ${key.id} --%>
 Locker is existing,Locker is  ${lockers.lockerId }  capacity of locker is ${lockers.capacity }
</p></div>
</div></body>
</html>