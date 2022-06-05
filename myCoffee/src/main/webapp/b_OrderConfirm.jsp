<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="Model.Porder"%>
  <%
  request.setCharacterEncoding("UTF-8");
  
  String Desk=request.getParameter("desk");
  int A=Integer.parseInt(request.getParameter("A"));
  int B=Integer.parseInt(request.getParameter("B"));
  int C=Integer.parseInt(request.getParameter("C"));
  
  
  Porder p=new Porder(Desk,A,B,C);
  
  session.setAttribute("P", p);//設定成session
  %>  
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
		<table width=500 align=center>
		
			<tr>
				<td colspan=2 align=center><h3>訂單細目</h3>
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td width=100 align=center>桌號
				<td><%=p.getDesk() %>
			<tr>
				<td width=100 align=center>1號(A餐)
				<td><%=p.getA() %>
			<tr>
				<td width=100 align=center>2號(B餐)
				<td><%=p.getB() %>
			<tr>
				<td width=100 align=center>3號(C餐)
				<td><%=p.getC() %>
			<tr>
				<td width=100 align=center>共
				<td><%=p.getSum() %>元
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td colspan=2 align=center>
				<a href="b_addOrderController">確定</a>
				<a href="b_addOrder.jsp">重填</a>
		</table>
		
		
		
		
		
		
	<tr height=40>
		<td align=center><jsp:include page="b_OrderEnd.jsp"/>
		

</table>
</body>
</html>