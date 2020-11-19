<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css"
	rel="stylesheet">
	<style>
	 .table{
	 margin:auto;
	 }
	</style>
</head>
<body>
<div class="container">
	<h2 style="text-align: center;">Flights</h2>
	<!-- this will display list of all the flights which matches the entered details.
	Write code to proceed with booking for one of the flight in the list  -->
	<table class="table table-hover">
	<thead class="thead-dark">
		<tr>
			<th>Flight Number</th>
			<th>Operating Airlines</th>
			<th>From</th>
			<th>To</th>
			<th>Departure Date</th>
			<th>Departure Time</th>
			<th>Book</th>
		</tr>
		</thead>
		<c:forEach items="${flights}" var="flight">
			<tr>
				<td>${flight.flightNumber}</td>
				<td>${flight.operatingAirlines}</td>
				<td>${flight.departureCity}</td>
				<td>${flight.arrivalCity}</td>
				<td>${flight.dateOfDept}</td>
				<td>${flight.estimatedDeptTime}</td>
				<td><a href="addPassenger?flightId=${flight.id}">Select</a></td>
				<!-- addPassengers is written in reservation controller -->
			</tr>
		</c:forEach>
	</table>
	<%@ include file = "/WEB-INF/jsps/commonparts/footer/footer.jsp" %>
</div>
</body>
</html>