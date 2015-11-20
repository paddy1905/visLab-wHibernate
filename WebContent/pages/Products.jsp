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
	       				<li><a href="<s:url action ="openAdminArea"/>">Admin Bereich</a></li>
	      			</ul>
	      			<ul class="nav navbar-nav navbar-right">
        				<li><a href="<s:url action = "logout"/>"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      				</ul>
	   			 </div>
  			</div>
		</nav>
		
		  <div class="row">
            <div class="col-md-9 col-md-offset-1">

                <div class="thumbnail">
                   <img src="http://placehold.it/800x200" alt="">
                    <div class="caption-full">
                        <h4 class="pull-right"><s:property value="price"/> Euro</h4>
                        <h4><a href="#"><s:property value ="name"/></a>
                        </h4>
                        <p>
                         <s:property value ="description"/>
                        </p>
                        
                    </div>
                    <div class="ratings">
                        <p class="pull-right"><s:property value ="catName"/></p>
                        <p>
                            <span class="glyphicon glyphicon-star"></span>
                            <span class="glyphicon glyphicon-star"></span>
                            <span class="glyphicon glyphicon-star"></span>
                            <span class="glyphicon glyphicon-star"></span>
                            <span class="glyphicon glyphicon-star-empty"></span>
                        </p>
                    </div>
                </div>
                        <div class="row">
            <div class="col-lg-12">
                <h3>Ähnliche Artikel</h3>
            </div>
        </div>
                <div class="row text-center">

           <s:iterator value ="relatedProducts" begin="0" end="3">
		 <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <img src="http://placehold.it/800x500" alt="">
                    <div class="caption">
                        <h3><s:property value ="name"/></h3>
                      <%--   <p><s:property value ="description"/></p> --%>
                        <p>
                   
                            <a href="#" class="btn btn-primary">Buy Now!</a> <a href="#" class="btn btn-default">More Info</a>
                        </p>
                    </div>
                </div>
            </div>
		
		</s:iterator>

        </div>
                
			</div>	
			
			
			
			
			
			
					
		
		
				
		</div>
		
		
		              


   

   

   
		<%-- <s:property value ="prodNr" />
		<s:property value ="name"/>
		<s:property value ="description"/>
		<s:property value ="price"/>
		<s:property value ="catName"/> --%>
	</body>
</html>
