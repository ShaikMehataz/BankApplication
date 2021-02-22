<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Details</title>

</head>
<div class="main" align="center">
<c:if test="${!empty bankList}">
<fieldset><legend><h3>Details of particular member, you wish to see!</h3></legend>
    <table class="bankAcccountTable">
    
        <tr><td>Name</td><td>:</td><td>${bank.acntName}</td></tr>
        <tr><td>Age</td><td>:</td><td>${{bank.acntAge}</td></tr>
        <tr><td>Gender </td><td>:</td><td>${bank.acntGender}</td></tr>
        <tr><td>Bank Name</td><td>:</td><td>${bank.acntBank}</td></tr>
        <tr><td>Card Number</td><td>:</td><td>${bank.acntCardNum}</td></tr>
        <tr><td>card limit</td><td>:</td><td>${bank.creditLimit}</td></tr>
        <tr><td>Transaction date</td><td>:</td><td>${bank.acntTdate}</td></tr>
        <tr><td>Amount</td><td>:</td><td>${bank.acntAmount}</td></tr>
    
		
</table>
</fieldset>
</c:if>
</div>
</body>
</html>
