<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value="resources/css/bootstrap.min.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="resources/css/signin.css"/>" />
<title>Registration</title>
</head>
<body>
	<c:url value="/signin" var="sign"></c:url>

	<div class="container">

		<form:form class="form-signin" action="${sign}" method="POST" modelAttribute="client">
			<h2 class="form-signin-heading">Please sign in</h2>
			<form:input type="text" class="form-control" path="userName" placeholder="Username"></form:input> 
			<form:input type="password" class="form-control" path="password" placeholder="Password"></form:input> 
			<label class="checkbox"> <input type="checkbox" value="remember-me">Remember me</label>
			<form:button class="btn btn-lg btn-primary btn-block" type="submit">Signin</form:button>
			<a href="registration" class="btn btn-lg btn-primary btn-block">Registration</a>
		</form:form>

	</div>
	<!-- /container -->
</body>
</html>