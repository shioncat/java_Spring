<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="Dao.porderDao"
    import="java.util.List"
    import="Model.Porder"%>
<%
/*
1.request-->判斷--->start,end-->"" ,null
2.true-->queryAll-->l
3.false-->querySum-->
*/
List<Object> l;
String Start=request.getParameter("start");
String End=request.getParameter("end");
if(Start=="" || Start==null || End=="" || End==null)
{
	l=new porderDao().queryAll();
}
else
{
	int S=Integer.parseInt(Start);
	int E=Integer.parseInt(End);
	l=new porderDao().querySum(S, E);
}

Porder[] p=l.toArray(new Porder[l.size()]);//Porder[] p=new Porder[l.size()];



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
				<form action="b_OrderQuery.jsp" method="post">
					金額 
					從<input type="text" name="start" size=5>
					到<input type="text" name="end" size=5>
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