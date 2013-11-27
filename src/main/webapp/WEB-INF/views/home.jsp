<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/bootstrap.min.css"/>" />
<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/home.css"/>" />
<title>Home Page</title>
</head>
<body>
	    <!-- Wrap all page content here -->
    <div id="wrap">

      <!-- Fixed navbar -->
      <div class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">${client.getUserName()}</a>
          </div>
          <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="#about">My Profile</a></li>
              <li><a href="#contact">Make a reservation</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li class="dropdown-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
                  <li><a href="#">One more separated link</a></li>
                </ul>
              </li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>

      <!-- Begin page content -->
      <div class="container" id="content">
        <div class="left-block">
        	<div class="hotel-info">
        		<img src="<c:url value="resources/img/marinabay.jpg"/>" />
        		<div class="info">
        			<h2>Marina Bay Sands</h2>
        			<p>Location:</p>
        			<p>Class:</p>
        			<p>Number of Apartments:</p>
        		</div>
        	</div>
        	<div class="about-hotel">
        		<span>marina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sands
        		marina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sands
        		marina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sands
        		marina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sands
        		marina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sands
        		marina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sands
        		marina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sands
        		marina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sands
        		marina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sands
        		marina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sandsmarina bay sands</span>
        	</div>
        </div>
        <div class="right-block"></div>
      </div>
    </div>
	
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
</body>
</html>