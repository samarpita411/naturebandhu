<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page
	import="com.teamsankya.naturebandhuproject.dto.ProductCategoryBean"%>
<%@page
	import="com.teamsankya.naturebandhuproject.dto.ProductDetailsBean"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<header>
	<table border="border" width="100%" height="0" bgcolor="teal"
		bordercolor="grey" style="font: bold;">
		<tr>
		<th><h5>
				 <font size="8" color="green" face="forte"><br>Nature Bandhu</font>
			    </h5></th>
			<th><h5>
					<form action="./getproduct" method="post">
                    <input type="text" name="name"> <input type="submit"
							value="Search">
					</form>
			</h5></th>
			<th><h5>
					<a href="failure.jsp">Login and Signup</a>
				</h5></th>
			<th><h5>
					<a href="failure.jsp">More</a>
				</h5></th>
			<th><h5>
					<a href="failure.jsp">Cart</a>
				</h5></th>
		</tr>
	</table>
	</header>

	<br>
	<br>
	<br>
	<div class="row">
	<%
		List<ProductDetailsBean> beans = (List<ProductDetailsBean>) request.getAttribute("productbean");
	%>
	

		<%
			for (ProductDetailsBean bean : beans) {
		%>
		<div class="column">
			<tr>
				<A href="failure.jsp"> <img
					src="images/<%=bean.getProductId()%>.jpeg" height="100px"
					width="100px"></A>
				<br>
				<%=bean.getProductName()%><br>
				<td><%="Rs. " + bean.getProductCost()%><br>
			</tr>
		</div>

		<%
			}
		%>

	</div>

	<br>
	<br>
	<br>
	<%-- <%@include jspPage="pagination.jsp" %> --%>
</body>
</html>