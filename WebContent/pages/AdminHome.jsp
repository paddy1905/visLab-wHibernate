<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>
 
<html>
	<head>
		<title ><s:text name="welcome.title"/></title>
		<link rel="stylesheet" type="text/css" href="common/bootstrap/bootstrap.min.css">
	</head>
	<body>
		<nav class="navbar navbar-inverse">
 			<div class="container-fluid">
    			<div class="navbar-header">
      				<a class="navbar-brand" href="#">MyShop</a>
   				</div>
    			<div>
	      			<ul class="nav navbar-nav">
	       				<li class="active"><a href="<s:url action ="openAdminHome"/>">Home</a></li>
	       				<li><a href="<s:url action ="openProductArea"/>">Produktverwaltung</a></li>
	       				<li><a href="<s:url action ="openCategoryArea"/>">Kategorieverwaltung</a></li>
	      			</ul>
	      			<ul class="nav navbar-nav navbar-right">
        				<li><a href="<s:url action = "logout"/>"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      				</ul>
	   			 </div>
  			</div>
		</nav>
		
		<div class="container">
			<div class="jumbotron">
  				<h1>Willkommen im Adminbereich</h1> 
  				<p>Hier haben sie die Möglichkeit Produkte sowie Kategorien
  				anzulegen, zu bearbeiten und diese zu löschen</p> 
			</div>
		</div>
	</body>
</html>

 



