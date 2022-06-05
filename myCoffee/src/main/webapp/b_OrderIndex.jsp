<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width=650 align=center border=1>
	<tr height=80>
		<td align=center><jsp:include page="b_OrderTitle.jsp"/>
	<tr height=500>
		<td align=center>
		<a href="b_addOrder.jsp">1)新增</a><br>	
		<a href="b_OrderQuery.jsp">2)查詢</a><br>	
		<a href="b_OrderUpdate.jsp">3)修改</a><br>	
		<a href="b_OrderDelete.jsp">4)刪除</a><br>	
		
		
	<tr height=40>
		<td align=center><jsp:include page="b_OrderEnd.jsp"/>

</table>

</body>
</html>