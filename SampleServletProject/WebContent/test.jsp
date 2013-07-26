<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Testing JSPs</h3>
	
	<%!
	public int add(int a, int b) {
		
		return a + b;
	}
	%>
	
	
	<%
		int i = 1;
		int j = 2;
		int k;
		
		k = i + j;
		
		out.println("Value of k : " + k);
	%>
	
	<br />
	The value of k is : <%=k %>
	
	<%
	k = add(1234, 4321);
	%>
	
	<br />
	The value of k is : <%=k %>
	
	<% for (i = 0 ; i < 5 ; i++) {
	%>
		<br /> i = <%=i %>
	<%} %>
</body>
</html>