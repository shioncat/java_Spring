<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="Dao.porderDao"
    import="java.util.List"
    import="Model.Porder"%>
    <%
    List<Object> l=new porderDao().queryAll();
    Porder[] p=l.toArray(new Porder[l.size()]);
    
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
		
		<table width=500 align=center border=0>
			<tr>
				<td colspan=6 align=center>
				<form action="b_deleteOrderController" method="post">
					
					id<input type="text" name="id" size=5>
					
					<input type="submit" value="ok">
				</form>
			<tr>
				<td colspan=6>
				<hr>
			<tr align=center>
				<td>id<td>桌號<td>A<td>B<td>C<td>sum
			<tr>
				<td colspan=6>
				<hr>
			<%
				for(int i=0;i<p.length;i++)
				{
					out.println("<tr align=center><td>"+p[i].getId()+
							"<td>"+p[i].getDesk()+
							"<td>"+p[i].getA()+
							"<td>"+p[i].getB()+
							"<td>"+p[i].getC()+
							"<td>"+p[i].getSum());
				}
				
			%>
			
			<tr>
				<td colspan=6>
				<hr>
			<tr>
				<td colspan=6 align=center>
				<a href="b_OrderIndex.jsp">首頁</a>
		</table>
		
		
	<tr height=40>
		<td align=center><jsp:include page="b_OrderEnd.jsp"/>

</table>
</body>
</html>