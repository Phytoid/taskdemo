<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Data</title>
</head>
<body>
<font color=blue size=6>
Employee id : ${edata.getEmpid()}<br>
Employee name : ${edata.getEmpname()}<br>
salary : ${edata.getSalary()}
</font>
</body>
</html>