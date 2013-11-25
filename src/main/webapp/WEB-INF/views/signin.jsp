<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value="resources/css/bootstrap.min.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="resources/css/signin.css"/>" />
<title>Registration</title>
</head>
<body>
	<div class="container">

		<form class="form-signin">
			<h2 class="form-signin-heading">Please sign in</h2>
			<input type="text" class="form-control" placeholder="Email address" required> 
			<input type="password" class="form-control" placeholder="Password" required> 
			<label class="checkbox"> <input type="checkbox" value="remember-me">Remember me</label>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Signin</button>
			<a href="registration" class="btn btn-lg btn-primary btn-block">Registration</a>
		</form>

	</div>
	<!-- /container -->
</body>
</html>