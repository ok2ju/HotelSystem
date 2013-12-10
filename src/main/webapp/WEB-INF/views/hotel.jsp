<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello hotel system!  
</h1>

<h3>hotel adder :)</h3>
<c:url value="/addHotel" var="addHotelUrl"></c:url>
<form:form action="${addHotelUrl}" method="POST" modelAttribute="hotel">
    <form:input path="name" class="input_field" size="20" maxlength="50" type="text" placeholder="Имя" AUTOCOMPLETE="off" />
    <form:input path="hotelClass" class="input_field" size="20" maxlength="50" placeholder="Местонахожденин" AUTOCOMPLETE="off"/>
    <form:input path="numberOfApartments" class="input_field" size="20" maxlength="5550" placeholder="Местонахожденин" AUTOCOMPLETE="off"/>
    <form:input path="location" class="input_field" size="20" maxlength="50" placeholder="Местонахожденин" AUTOCOMPLETE="off"/>
    <form:input path="info" class="input_field" size="20" maxlength="10000" placeholder="Местонахожденин" AUTOCOMPLETE="off"/>
    <input class="input_submit" type="submit" value="Добавить" />
</form:form>
</body>
</html>
