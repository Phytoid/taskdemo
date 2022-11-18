<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" 
    prefix = "tags"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
<tags:form action="saveEmployee" modelAttribute="empobj">
<table>
<tr>
	<td>Employee id </td>
	<td><tags:input path="empid"/></td>
</tr>
<tr>
	<td>Employee Name</td>
	<td><tags:input path="empname"/></td>
</tr>
<tr>
	<td>Salary</td>
	<td><tags:input path="salary"/></td>
</tr>
<tr>
	<td></td>
	<td><input type="submit" value="Enter Data"/>
</table>
</tags:form>

</body>
</html>