<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html >
	<head>
		<title ><s:text name="welcome.title"/></title>
		<link rel="stylesheet" type="text/css" href="common/bootstrap/bootstrap.min.css">
	</head>
	<body>
	<div style="padding-left: 2%; padding-right: 2%; padding-top: 0.5%;">
		<div>
			<ul class="nav nav-tabs">
				<li><a href="<s:url action="openHome"/>">Home</a> </li>
				<li class="active"><a href="<s:url action="openSearch"/>">Suche</a> </li>
				<li><a href="<s:url action="openProduct"/>">Produkte</a> </li>
 			</ul>
 		</div>	
 		
 		<div class = "row">
 			<div class ="col-md-5">
 				<s:form action="Suchen" theme ="simple">
					<div class ="form-group">
						<label><s:text name="Beschreibung"/></label>
						<s:textfield name="description" cssClass = "form-control"/>
					</div>
					
					<div class ="form-group">
						<label><s:text name="Preis minimum"/></label>
						<s:textfield name="preisMin" cssClass = "form-control"/><br>
					</div>
											
					<div class ="form-group">
						<label><s:text name="Preis maximum"></s:text></label>
						<s:textfield name="preisMax" cssClass = "form-control"/><br>
					</div>
											
					<div class = "pull-right">
						<s:submit method="execute" value="Suchen" align="center" cssClass="btn btn-default"/>
					</div>
				</s:form>
 			</div>
 			
 			<div class ="col-md-7">
 				<h3>Suchergebnisse:</h3>
 				<table class ="table table-striped">
 					<thead>
 						<tr>
 							<th>Beschreibung</th>
 							<th>Preis</th>
 							<th>Kategorie</th>
 						</tr>
 					</thead>
 					
 					<s:iterator value="result">
			 			<tr>
			 				<td> <s:property value="description"/> </td>
			 				<td> <s:property value="price"/> </td>
			 				<td> <s:property value="kategory"/> </td>
 						</tr>    
					</s:iterator>
				</table>	
 			</div>	
 		</div>	
	</div>
</body>
</html>
