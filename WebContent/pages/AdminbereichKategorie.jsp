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
  			<li><a href="<s:url action = "openAdminArea"/>">Produktverwaltung</a></li>
  			<li  class="active"><a href="#">Kategorieverwaltung</a></li>
		</ul>
	</body>
	<div style="padding-left: 2%; padding-right: 2%; padding-top: 0.5%;">
	 		<div class = "row">
	 		
	 			<s:if test="hasActionMessages()">
					<div class="alert alert-info" role="alert">
						<s:actionmessage cssStyle="list-style: none;"/>
					</div>
				</s:if>
	 			<div class ="col-md-6">		
					<div class="panel panel-default">
  						<div class="panel-heading"><span class="glyphicon glyphicon-plus"></span>   Neues Kategorie anlegen</div>
  						<div class="panel-body">
  							<s:form action="createCategory" theme ="simple">		
								<div class ="form-group">
									<label>Kategorienummer</label>
									<s:textfield name="catNr"  placeholder="4" cssClass = "form-control"/>
								</div>
								
								<div class ="form-group">
									<label>Name</label>
									<s:textfield name="name" placeholder="Winterjacken" cssClass = "form-control"/>
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
  						<div class="panel-heading"><span class="glyphicon glyphicon-minus"></span>   Kategorie löschen</div>
  						<div class="panel-body">
  							<s:form action="deleteCategory" theme ="simple">		
								<div class ="form-group">
									<label for="sel1">Kategorie</label>
  									<s:select name="catIdFromSelectDelete" value="catIdFromSelectDelete" cssClass="form-control" 
			  							 list="catResult" listValue="name" listKey="catId"/>
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
  						<div class="panel-heading"><span class="glyphicon glyphicon-pencil"></span>   Katgorie bearbeiten</div>
  						<div class="panel-body">
  							<s:form theme ="simple">				  					
			  					<div class ="form-group">
									<label for="sel1">Kategorie</label>
			  						<s:select name="catIdFromSelectEdit" value="catIdFromSelectEdit" cssClass="form-control" 
			  							 list="catResult" listValue="name" listKey="catId"/>
			  					</div>
			  					
			  					<div class="form-group">
			  						<label>Name</label>
			  						<s:textfield name="nameForEdit" placeholder="Winterjacken" cssClass = "form-control"/>
			  					</div>
			  					
			  					<div class = "pull-right">
			  						<div class ="btn-group" role ="group">
										<s:submit action="showCategory" value="Anzeigen" cssClass="btn btn-default"/>
			  							<s:submit action="editCategory" value="Bearbeiten" cssClass="btn btn-default"/>
			  						</div>
								</div>
							</s:form>
  						</div>
					</div>
				</div>
			</div>
		</div>
</html>
