<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html>
<head>
<link rel="stylesheet" type="text/css" href="common/bootstrap/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Beispiel Login Seite</title>
	<s:head/>
</head>
<body>
	<div class = "row">
		<div class ="col-md-3 col-md-offset-4">
			<div class="panel panel-default">
	  					<div class="panel-heading">
	  						<h2>Login</h2>
	  					</div>
	  					<div class="panel-body">
							<s:form action="User_login" focusElement="username" theme="simple"> 
									
								<div class = "form-group">
									<label>Benutzername <font color="red">*</font></label>
									<s:textfield name="username" cssClass ="form-control"/>
								</div>
								
								<div class = "form-group">
									<label>Passwort <font color="red">*</font></label>
									<s:password name="password" cssClass = "form-control" />
								</div>
									
								<div class = "pull-right">
									<s:submit method="execute" value="login" align="center" cssClass="btn btn-success"/>
								</div>
									
								<div>
									<p><a href="<s:url action="register"/>">Noch nicht registriert?</a> </p>
					 			</div>
							</s:form>
								
							<div style="padding-top: 5%;">
								<s:if test="hasActionErrors()">
									<div class="alert alert-danger" role="alert">
						  				<span class="sr-only">Error:</span>
						  					<s:actionerror cssStyle="color: #DE3A75; list-style: none;"/>
						  			</div>
					  			</s:if>
  							</div>
  							
  							<s:if test="hasFieldErrors()">
  								<div class="alert alert-danger" role="alert">
						  			<span class="sr-only">Error:</span>
						  				<s:fielderror fieldName="username" cssStyle="color: #DE3A75; list-style: none;"/>
						  				<s:fielderror fieldName="password" cssStyle="color: #DE3A75; list-style: none;"/>
						  		</div>	
						  	</s:if>
  						</div>	
  			</div>
		</div>
	</div>	 
 </body>
</html>