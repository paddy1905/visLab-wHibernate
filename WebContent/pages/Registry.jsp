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
			<div class="panel panel-default">
	  					<div class="panel-heading">
							<h2>Registrierung</h2>
						</div>
	  					<div class="panel-body">
							<s:form action="User_registred" theme = "simple">   
								<div class = "form-group">
									<label>Benutzername</label>
									<s:textfield name="username" cssClass ="form-control"/> 
								</div>
							
								<div class = "form-group">
									<label>Passwort</label>
									<s:password name="password" cssClass = "form-control" /><br>
								</div>
								
								<div class = "form-group">
									<label>Passwort wiederholen</label>
									<s:password name="passwordRepeat" cssClass = "form-control" /><br>
								</div>
								
								<div class = "form-group">
									<label>Vorname</label>
									<s:textfield name="firstname" cssClass = "form-control" /><br>
								</div>
								
								<div class = "form-group">
									<label>Nachname</label>
									<s:textfield name="lastname" cssClass = "form-control" /><br>
								</div>
								
								<div class = "pull-right">
									<s:submit method="execute" value="Registrieren" align="center" cssClass="btn btn-success"/>
								</div>
							</s:form>
						</div>
			</div>
		</div>
	</div>
</body>