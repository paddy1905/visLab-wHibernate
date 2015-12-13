<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html >
	<head>
		<title ><s:text name="welcome.title"/></title>
		<link rel="stylesheet" type="text/css" href="common/bootstrap/bootstrap.min.css">
		<link rel="stylesheet" href="common/bootstrap/datepicker.css">

	</head>
	<body>
		<nav class="navbar navbar-inverse">
 			<div class="container-fluid">
    			<div class="navbar-header">
      				<a class="navbar-brand" href="#">MyShop</a>
   				</div>
    			<div>
	      			<ul class="nav navbar-nav">
	       				<li><a href="<s:url action ="openAdminHome"/>">Home</a></li>
	       				<li class="active"><a href="<s:url action ="openProductArea"/>">Produktverwaltung</a></li>
	       				<li><a href="<s:url action ="openCategoryArea"/>">Kategorieverwaltung</a></li>
	      			</ul>
	      			<ul class="nav navbar-nav navbar-right">
        				<li><a href="<s:url action = "logout"/>"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      				</ul>
	   			 </div>
  			</div>
		</nav>
		
		<div style="padding-left: 2%; padding-right: 2%; padding-top: 0.5%;">
	 		<div class = "row">
	 			<s:if test="hasActionMessages()">
					<div class="alert alert-info" role="alert">
						<!-- <button type='button' class='close' data-dismiss='alert'>×</button> -->
						<s:actionmessage cssStyle="list-style: none;"/>
					</div>
				</s:if>
	 			<div class ="col-md-6">		
					<div class="panel panel-default">
  						<div class="panel-heading"><span class="glyphicon glyphicon-plus"></span>   Neues Produkt anlegen</div>
  						<div class="panel-body">
  							<s:form action="createProduct" theme ="simple">	
  							
  							<div class ="row">	
								<div class ="form-group col-xs-6" style="margin-bottom:2px">
									<label>Artikelnummer <font color="red">*</font></label>
									<s:textfield name="artNr"  placeholder="..." cssClass = "form-control"/>
									<s:fielderror fieldName="artNr" cssStyle="color: #DE3A75; list-style: none; margin-top:5px"/>
						  					
						  	
								</div>
								<div class ="form-group col-xs-6" style="margin-bottom:2px">
									<div class ="form-group">
										<label>Name</label>
										<s:textfield name="name" placeholder="..." cssClass = "form-control"/>
										<s:fielderror fieldName="name" cssStyle="color: #DE3A75; list-style: none; margin-top:5px"/>
									</div>
								</div>
							</div>
								
								<div class ="form-group">
									<label>Beschreibung</label>
									<s:textarea name="description" placeholder="..." cssClass = "form-control"/>
								</div>
								
								<div class ="form-group">
				  				 	<label>Erscheinungsdatum</label>
	 								<div class="input-group">
	                					<s:textfield type="text" id="dateCreate" cssClass="form-control" name ="releaseDateForCreate"/>
	                					<span class="input-group-addon"><span class ="glyphicon glyphicon-calendar"></span></span> 
	            					</div>
	            				</div>
									
								<div class ="form-group">
									<label>Preis</label>
									<s:textfield name="price" placeholder="..." cssClass = "form-control"/>
									<s:fielderror fieldName="price" cssStyle="color: #DE3A75; list-style: none; margin-top:5px"/>
								</div>
																
								<div class ="form-group">
									<label for="sel1">Kategorie</label>
			  						<s:select name="catIdFromSelectCreate" value="catIdFromSelectCreate" cssClass="form-control" 
			  							 list="catResult" listValue="name" listKey="catId"/>
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
  						<div class="panel-heading"><span class="glyphicon glyphicon-minus"></span>   Produkt löschen</div>
  						<div class="panel-body">
  							<s:form action="deleteProduct" theme ="simple">		
								<div class ="form-group">
									<label for="sel1">Artikel</label>
			  						<s:select name="idFromSelectDelete" value="idFromSelectDelete" cssClass="form-control" 
			  							 list="result" listValue="name" listKey="id"/>
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
  						<div class="panel-heading"><span class="glyphicon glyphicon-pencil"></span>   Produkt bearbeiten</div>
  						<div class="panel-body">
  							<s:form theme ="simple">				  					
			  					<div class ="form-group">
									<label for="sel1">Artikel</label>
			  						<s:select name="idFromSelectEdit" value="idFromSelectEdit" cssClass="form-control" 
			  							 list="result" listValue="name" listKey="id"/>
			  					</div>
			  						  						
			  					<div class ="form-group">
									<label>Name</label>
									<s:textfield name="nameForEdit"  cssClass = "form-control"/>
								</div>
								
								<div class ="form-group">
									<label>Beschreibung</label>
									<s:textarea name="descriptionForEdit" cssClass = "form-control" />
								</div>
								
								<div class ="form-group">
				  				 	<label>Erscheinungsdatum</label>
	 								<div class="input-group">
	                					<s:textfield type="text" id="dateEdit" cssClass="form-control" name ="releaseDate"/>
	                					<span class="input-group-addon"><span class ="glyphicon glyphicon-calendar"></span></span> 
	            					</div>
	            				</div>
								
								<div class ="form-group">
									<label>Preis</label>
									<s:textfield name="priceForEdit" cssClass = "form-control"/>
									<s:fielderror fieldName="priceForEdit" cssStyle="color: #DE3A75; list-style: none; margin-top:5px"/>
								</div>
								
								<div class ="row">
									<div class ="form-group col-xs-6">
										<div class ="form-group">
											<label>Kategorie</label>
											<s:textfield name="catForEditShow" cssClass = "form-control" disabled ="true"/>
										</div>
									</div>
								
									<div class ="form-group col-xs-6">
										<div class ="form-group">
											<label for="sel1">Neue Kategorie wählen</label>
			  								<s:select name="catIdFromSelectEdit" value="catIdFromSelectEdit" cssClass="form-control" 
			  									 list="catResult" listValue="name" listKey="catId"/>
			  							</div>
			  						</div>
			  					</div>
			  					
			  					<div class = "pull-right">
			  						<div class ="btn-group" role ="group">
			  							<s:submit action="showProduct" value="Anzeigen" cssClass="btn btn-default"/>
			  							<s:submit action="editProduct" value="Bearbeiten" cssClass="btn btn-default"/>
			  						</div>	
								</div>
							</s:form>
  						</div>
					</div>
				</div>
			</div>
		</div>
		  <script src="common/js/jquery-1.9.1.min.js"></script>
        <script src="common/js/bootstrap-datepicker.js"></script>
        <script type="text/javascript">

            $(document).ready(function () {
                $('#dateCreate').datepicker({
                    format: "dd.mm.yyyy",       
                });
                $('#dateEdit').datepicker({
                    format: "dd.mm.yyyy",         
                });
            });
        </script>
		
	</body>
</html>
