<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation</title>
<link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.table{
width:900px;
margin:30px auto;
}
</style>
</head>
<body>
<div class="container-fluid">

  <h2 style="text-align: center;">Flight Ticket Booked</h2>
  <table class="table table-sm table-bordered">
	<thead>
	<tr>
		<th colspan="4">Flight Details</th>
	</tr>
	</thead>
		<tr>
			<th>First Name : </th>
			<td>${firstName}</td>
		
			<th>Last Name : </th>
			<td>${lastName}</td>
		</tr>
		<tr>
			<th>Email :</th>
			<td>${email}</td>
		
			<th>Mobile : </th>
			<td>${phone}</td>
		</tr>
		<tr>
			<th>Flight Number : </th>
			<td>${flightNumber}</td>
		
			<th>Airlines : </th>
			<td>${operatingAirlines}</td>
		</tr>
		<tr>
			<th>Departure City :</th>
			<td>${deptartureCity}</td>
		
			<th>Arrival City : </th>
			<td>${arrivalCity}</td>
		</tr>
		<tr>
			<th>Date of Departure :</th>
			<td>${dateOfDept}</td>
		
			<th>Time of Departure :</th>
			<td>${estimatedDeptTime}</td>
		</tr>
	</table>
	<%@ include file = "/WEB-INF/jsps/commonparts/footer/footer.jsp" %>
</div>
</body>
</html>