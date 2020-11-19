<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Passenger Details</title>
<link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css"
	rel="stylesheet">
<style>
th, td {
	width: 25%;
}
.table{
	width:800px;
	margin:30px auto;
}
.box {
	width: 480px;
	margin: 30px auto 120px auto;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<h2 style="text-align: center;">Complete Reservation</h2>

		
		<table class="table table-sm table-bordered">
			<thead>
				<tr>
					<th colspan="4">Flight Details</th>
				</tr>
			</thead>
			<tr>
				<th>Flight Number :</th>
				<td>${flight.flightNumber}</td>

				<th>Airlines :</th>
				<td>${flight.operatingAirlines}</td>
			</tr>
			<tr>
				<th>Departure City :</th>
				<td>${flight.departureCity}</td>

				<th>Arrival City :</th>
				<td>${flight.arrivalCity}</td>
			</tr>
			<tr>
				<th>Date of Departure :</th>
				<td>${flight.dateOfDept}</td>

				<th>Time of Departure :</th>
				<td>${flight.estimatedDeptTime}</td>
			</tr>
		</table>
		<br> <br>
		<!-- to save data to database instead of using @ModelAttribute we are using a separate
	class , so write matching names to that class variables. -->
		<div class="box">
			<form action="confirmBooking" method="post">
				<div class="form-group">
					<label>First Name </label>
					<input type="text" name="passengerFirstName" class="form-control">
				</div>
				<div class="form-group">
					<label>Last Name </label>
					<input type="text" name="passengerLastName" class="form-control">
				</div>
				<div class="form-group">
					<label>Email </label>
					<input type="email" name="passengerEmail" class="form-control">
				</div>
				<div class="form-group">
					<label>Mobile</label>
					<input type="text" name="passengerPhone" class="form-control">
				</div>
				<input type="hidden" name="flightId" value="${flight.id}"> <input
					type="submit" value="Confirm Booking"
					class="btn btn-outline-success">
			</form>
		</div>
		<%@ include file = "/WEB-INF/jsps/commonparts/footer/footer.jsp" %>
	</div>
</body>
</html>