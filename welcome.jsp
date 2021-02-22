<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="main" align="center">
		<h3>List of all bank members</h3>
		<c:if test="${!empty bankList}">
			<table class="bankAccountTable">
				<tr>
					<th width="40">Name</th>
					
	
				</tr>
				<c:forEach items="${bankList}" var="bank">
					<tr>
						<td>${bank.acntName}</td>
														
						<a href="<c:url value='/getDetails/${bank.acntName}'/>"><button>${"view"}</button></a>
						</td>	
						
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>


</body>
</html>