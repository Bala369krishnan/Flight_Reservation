<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link href="webjars/bootstrap/4.5.3/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.box {
	width: 480px;
	margin: 30px auto;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<div class="box">
			<h2>Login Page</h2>
			<p>
				New User ? <a href="signUpPage"> Sign up</a>
			</p>
			<p>${loginMsg}</p>
			<form action="verifyLogin" method="post">
				<!-- name value in input fields should match with variable name 
	         in entity class   -->
				<div class="form-group">
					<label>Email </label>
					<input type="email" name="email" class="form-control">
				</div>
				<div class="form-group">
					<label>Password</label>
					<input type="password" name="password" class="form-control">
				</div>
				<input type="submit" value="Login" class="btn btn-outline-success">

			</form>
		</div>
		<%@ include file = "/WEB-INF/jsps/commonparts/footer/footer.jsp" %>
	</div>
</body>
</html>