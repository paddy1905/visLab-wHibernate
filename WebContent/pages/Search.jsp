<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html >
	<head>
		<title >Suche</title>
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
	       				<li class="active"><a href="<s:url action ="openSearch"/>">Suche</a></li>
	       				<li><a href="<s:url action ="openProduct"/>">Produkte</a></li>
	       				<li><a href="<s:url action ="openAdminArea"/>">Admin Bereich</a></li>
	      			</ul>
	      			<ul class="nav navbar-nav navbar-right">
        				<li><a href="<s:url action = "logout"/>"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      				</ul>
	   			 </div>
  			</div>
		</nav>	
	
 		<div style="padding-left: 2%; padding-right: 2%; padding-top: 0.5%;">
	 		<div class = "row">
	 			<div class ="col-md-5">
		 			<div class="panel panel-default">
	  					<div class="panel-heading">Suche..</div>
	  						<div class="panel-body">
				 				<s:form action="Suchen" theme ="simple">		
									<div class ="form-group">
										<label>Beschreibung</label>
										<s:textfield name="description"  placeholder="Shirt.." cssClass = "form-control"/>
									</div>
									
									<div class ="form-group">
										<label>Preis minimum</label>
										<s:textfield name="preisMin" placeholder="15" cssClass = "form-control"/>
									</div>
															
									<div class ="form-group">
										<label>Preis maximum</label>
										<s:textfield name="preisMax" placeholder="30" cssClass = "form-control"/>
									</div>
									
									<div class ="form-group">
										<label>Kategorien</label>
			  						<s:select name="catIdForSearch" value="catIdForSearch" cssClass="form-control" 
			  							 list="resultCat" listValue="catId" listKey="catId"/>
			  						</div>
			  						
															
									<div class = "pull-right">
										<s:submit method="execute" value="Suchen" cssClass="btn btn-default"/>
									</div>
								</s:form>
		 					</div>
	 				</div>
	 			</div>
	 			
	 			<div class ="col-md-7">
	 			
	 				<h3>Suchergebnisse:</h3>
	 				<table class ="table table-striped">
	 					<thead>
	 						<tr>
	 							<th>Artikelnummer</th>
	 							<th>Name</th>
	 							<th>Preis</th>
	 							<th>Kategorie</th>
	 						</tr>
	 					</thead>
	 					
	 					<s:iterator value="result">
				 			<tr>
				 				<td> <s:property value ="id"/></td>
				 				<td> <s:property value="name"/> </td>
				 				<td> <s:property value="price"/> </td>
				 				<td> <s:property value="category.name"/> </td>
				 				<!-- Form rein mit hidden textfeld und verweis auf eine variable, dann kann ich in action damit arbeiten -->
				 				<td> 
				 					<s:form action="showDetails" theme ="simple">
				 						<s:hidden name ="detailKey" value="%{id}"/>
				 						<s:submit value="Details" cssClass="btn btn-default"/>
				 					</s:form>
				 				
				 				
	 						</tr>    
						</s:iterator>
					</table>	
 				</div>	
 			</div>	
		</div>
	</body>
</html>
