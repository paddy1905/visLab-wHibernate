<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html >
	<head>
		<title ><s:text name="welcome.title"/></title>
		<link rel="stylesheet" type="text/css" href="common/bootstrap/bootstrap.min.css">
	</head>
	<body>
		<s:div style="padding-left: 2%; padding-right: 2%; padding-top: 0.5%;">
			<ul class ="nav nav-tabs">
				<li class="active"><a href="<s:url action="openHome"/>">Home</a> </li>
				<li><a href="<s:url action="openSearch"/>">Suche</a> </li>
				<li><a href="<s:url action="openProduct"/>">Produkte</a> </li>
			</ul>
	 		<p>Herzlich Willkommen</p>
	 	</s:div>
	</body>
</html>
