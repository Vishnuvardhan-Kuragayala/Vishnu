<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix ="c" uri ="http://www.springframework.org/tags/form" %>
	<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <script>
        
      </script>
</head>
<body>
 <div class="panel panel-primary">




            <!---------------------------------------Header Strats----------------------------------------->
           <div class="panel-heading"><center><h1>AMAZON INVENTORY MANAGEMENT SYSTEM</h1></center></div>
            
            <!---------------------------------------Header Ends------------------------------------------->



            <!---------------------------------------Navigation Starts------------------------------------->
            <div class="panel-body">
                <div class="container">
  <h2>lOCKER</h2>
  <form class="form-horizontal col-sm-offset-4" id="form" action="addLocker" method="post" modelAttribute="locker"">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Locker. Id. :</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="locker_id" placeholder="Enter Locker id" name="lockerId">
      </div>
    </div>
   
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Locker-  capacity. :</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="locker_capacity" placeholder="Enter Locker capacity" name="capacity">
      </div>
    </div>
   
    
  
    
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-4">
        <button type="submit" class="btn btn-primary">Add Locker</button>
      </div>
    </div>
            </div>
            <!--------------------------------------------------Navigation Ends--------------------------->


        </div>
</html>