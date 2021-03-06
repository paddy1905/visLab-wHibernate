<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html >
	<head>
		<title ><s:text name="welcome.title"/></title>
		<link rel="stylesheet" type="text/css" href="common/bootstrap/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="common/bootstrap/shop-item.css">
		<link rel="stylesheet" type="text/css" href="common/bootstrap/heroic-features.css">	
		
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
	       				<li class="active"><a href="<s:url action ="openProduct"/>">Produkte</a></li>
	      			</ul>
	      			<ul class="nav navbar-nav navbar-right">
        				<li><a href="<s:url action = "logout"/>"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      				</ul>
	   			 </div>
  			</div>
		</nav>
		
		  <div class="row" style="margin-left:0px; margin-right:0px">
            

     
  

           <s:iterator value ="products">
		 	<div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <img src="http://placehold.it/800x500" alt="">
                    <div class="caption">
                        <h3><s:property value ="name"/></h3>
                        <p>
	                   		<s:form action="showDetails" theme ="simple">
					 			<s:hidden name ="detailKey" value="%{id}"/>
					 			<s:submit value="Details" cssClass="btn btn-default"/>
					 			<a href="#" class="btn btn-default">Buy Now!</a>
					 		</s:form>                         
				 		</p>
                    </div>
                </div>
            </div>
		   </s:iterator>
	    </div>
      	
	
  </body>
</html>