<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html >
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
	       				<li><a href="<s:url action ="openHome"/>">Home</a></li>
	       				<li><a href="<s:url action ="openSearch"/>">Suche</a></li>
	       				<li><a href="<s:url action ="openProduct"/>">Produkte</a></li>
	       				<li class="active"><a href="<s:url action ="openAdminArea"/>">Admin Bereich</a></li>
	      			</ul>
	      			<ul class="nav navbar-nav navbar-right">
        				<li><a href="<s:url action = "logout"/>"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      				</ul>
	   			 </div>
  			</div>
		</nav>
		<ul class="nav nav-tabs">
  			<li class="active"><a href="#">Produktverwaltung</a></li>
  			<li><a href="<s:url action ="openAdminCat"/>">Kategorieverwaltung</a></li>
		</ul>
		
		<div style="padding-left: 2%; padding-right: 2%; padding-top: 0.5%;">
	 		<div class = "row">
	 			<div class ="col-md-6">		
					<div class="panel panel-default">
  						<div class="panel-heading">Produkt anlegen</div>
  						<div class="panel-body">
  							<s:form action="create" theme ="simple">		
								<div class ="form-group">
									<label>Artikelnummer</label>
									<s:textfield name="artNr"  placeholder="..." cssClass = "form-control"/>
								</div>
								
								<div class ="form-group">
									<label>Name</label>
									<s:textfield name="name" placeholder="..." cssClass = "form-control"/><br>
								</div>
									
								<div class ="form-group">
									<label>Preis</label>
									<s:textfield name="price" placeholder="..." cssClass = "form-control"/><br>
								</div>
														
								<div class ="form-group">
									<label>Beschreibung</label>
									<s:textarea name="description" placeholder="..." cssClass = "form-control"/><br>
								</div>
								
								<div class ="form-group">
									<label for="sel1">Kategorie</label>
			  						<s:select name="catIdFromSelectCreate" value="catIdFromSelectCreate" cssClass="form-control" 
			  							id="sel1" list="catResult" listValue="nr" listKey="nr"/>
			  					</div>
								
								<div class = "pull-right">
									<s:submit method="execute" value="Anlegen" cssClass="btn btn-success"/>
								</div>
							</s:form>
  						</div>
					</div>
				</div>
				
				<div class ="col-md-6">		
					<div class="panel panel-default">
  						<div class="panel-heading">Produkt löschen</div>
  						<div class="panel-body">
  							<s:form action="delete" theme ="simple">		
								<div class ="form-group">
									<label for="sel1">Artikelnummer</label>
			  						<s:select name="idFromSelectDelete" value="idFromSelectDelete" cssClass="form-control" 
			  							id="sel1" list="result" listValue="id" listKey="id"/>
			  					</div>
								<div class = "pull-right">
									<s:submit method="execute" value="Löschen" cssClass="btn btn-danger"/>
								</div>
							</s:form>
  						</div>
					</div>
				</div>
				<div class ="col-md-6">		
					<div class="panel panel-default">
  						<div class="panel-heading">Produkt bearbeiten</div>
  						<div class="panel-body">
  							<s:form action="edit" theme ="simple">				  					
			  					<div class ="form-group">
									<label for="sel1">Artikelnummer</label>
			  						<s:select name="idFromSelectEdit" value="idFromSelectEdit" cssClass="form-control" 
			  							id="sel1" list="result" listValue="id" listKey="id"/>
			  					</div>
			  					
			  					<div class = "pull-right">
									<s:submit method="execute" value="Anzeigen" cssClass="btn btn-default"/>
								</div>
			  				
			  					<div class ="form-group">
									<label>Artikelnummer</label>
									<s:textfield name="nrForEdit"  cssClass = "form-control"/><br>
								</div>
								
			  					<div class ="form-group">
									<label>Name</label>
									<s:textfield name="nameForEdit"  cssClass = "form-control"/><br>
								</div>
								<div class ="form-group">
									<label>Preis</label>
									<s:textfield name="priceForEdit" cssClass = "form-control"/><br>
								</div>
								<div class ="form-group">
									<label>Beschreibung</label>
									<s:textarea name="descriptionForEdit" cssClass = "form-control"/><br>
								</div>
							</s:form>
  						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
