<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>

<h1>Student Form</h1>

</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		
		First Name: <form:input path="firstName"/>
		Last Name: <form:input path="lastName"/>
		
		<br><br>
		<form:select path="country">
			<form:options items="${student.options}"/>
		</form:select>
		<br><br>
		Java <form:radiobutton path="favLang" value="Java"/>
		C <form:radiobutton path="favLang" value="C"/>
		PHP <form:radiobutton path="favLang" value="PHP"/>
		Ruby <form:radiobutton path="favLang" value="Ruby"/>
		<br><br>
		Linux<form:checkbox path="operatingSystem" value="Linux"/>
		Mac<form:checkbox path="operatingSystem" value="Mac"/>
		Windows<form:checkbox path="operatingSystem" value="Windows"/>
		<input type="submit" value="SUBMIT"/>
		
	</form:form>
	

</body>

</html>