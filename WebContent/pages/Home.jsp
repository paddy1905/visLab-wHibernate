<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>

<%-- <html >
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
	       				<li class="active"><a href="<s:url action ="openHome"/>">Home</a></li>
	       				<li><a href="<s:url action ="openSearch"/>">Suche</a></li>
	       				<li><a href="<s:url action ="openProduct"/>">Produkte</a></li>
	       				<li><a href="<s:url action ="openAdminArea"/>">Admin Bereich</a></li>
	      			</ul>
	      			<ul class="nav navbar-nav navbar-right">
        				<li><a href="<s:url action = "logout"/>"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      				</ul>
	   			 </div>
  			</div>
		</nav>
		
		<div class="container">
			<div class="jumbotron">
  				<h1>Willkommen</h1> 
  				<p>Wir bieten eine groﬂe Auswahl von Filmen bladsfdfdsf
  				sdfdsfdsfdsfdsf</p> 
			</div>
		</div>
		
		
		
		<s:property value="firstname"/>	
	</body>
</html>
 --%>
 

<html>
    <head>
        <title>bootstrap datepicker examples</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS and bootstrap datepicker CSS used for styling the demo pages-->
        <link rel="stylesheet" href="common/bootstrap/datepicker.css">
        <link rel="stylesheet" href="common/bootstrap/bootstrap.min.css">
    </head>
    <body>
        <div class="row">
        <div class ="col-md-3 col-md-offset-4">
        	<s:form theme ="simple" action="testDate">
            	<div class="input-group">
                	<s:textfield type="text" id="example1" cssClass="form-control" name ="datepicker"/>
                	<span class="input-group-addon"><span class ="glyphicon glyphicon-calendar"></span></span> 
            	</div>
            	
            	<div class = "pull-right">
									<s:submit method="execute" value="test" align="center" cssClass="btn btn-success"/>
								</div>
            	
           </s:form>
           </div>
           
           
           <s:property value="date"/>
        </div>
        <!-- Load jQuery and bootstrap datepicker scripts -->
        <script src="common/js/jquery-1.9.1.min.js"></script>
        <script src="common/js/bootstrap-datepicker.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#example1').datepicker({
                    format: "dd.mm.yyyy"
                });  
            });
        </script>
    </body>
</html> 

