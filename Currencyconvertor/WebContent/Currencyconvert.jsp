<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#FF0033">
<s:form action="convertsuccess">

<s:select list="Nation" label="From" name="from"></s:select>

<s:textfield name="amount" label="AMount"></s:textfield>

<s:select list="Nation" name="to" label="To"></s:select>

<s:submit></s:submit>

</s:form>
</body>
</html>