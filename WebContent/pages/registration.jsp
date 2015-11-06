<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html>
<head>
<link rel="stylesheet" type="text/css" href="common/bootstrap/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrierung</title>
	<s:head/>
</head>
<body>
	<div class = "row">
		<div class ="col-md-3 col-md-offset-4">
			<h1>Registrierung</h1>
			<s:form action="User_registred" theme = "simple">   
				<div class = "form-group">
					<label><s:text name="Username"></s:text></label>
					<s:textfield name="username" cssClass ="form-control"/> 
				</div>
			
				<div class = "form-group">
					<label><s:text name="Passwort"></s:text></label>
					<s:password name="password" cssClass = "form-control" /><br>
				</div>
				
				<div class = "form-group">
					<label><s:text name="Passwort wiederholen"></s:text></label>
					<s:password name="passwordRepeat" cssClass = "form-control" /><br>
				</div>
				
				<div class = "form-group">
					<label><s:text name="Vorname"></s:text></label>
					<s:password name="firstName" cssClass = "form-control" /><br>
				</div>
				
				<div class = "form-group">
					<label><s:text name="Nachname"></s:text></label>
					<s:password name="lastName" cssClass = "form-control" /><br>
				</div>
				
				<div class = "pull-right">
					<s:submit method="execute" value="Registrieren" align="center" cssClass="btn btn-success"/>
				</div>
			</s:form>
		</div>
	</div>
</body>