<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="Model.Porder"
    import="Dao.porderDao"%>

<%
Porder p=(Porder)session.getAttribute("P");

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<SCRIPT LANGUAGE="JavaScript">

<!-- This script and many more are available free online at -->
<!-- The JavaScript Source!! http://javascript.internet.com -->

<!-- Begin
function varitext(text){
text=document
print(text)
}
//  End -->
</script>

</head>
<body>

<table width=650 align=center border=1>
	<tr height=80>
		<td align=center><jsp:include page="b_OrderTitle.jsp"/>
	<tr height=500>
		<td align=center>
	
		
		<table width=500 align=center>
		
			<tr>
				<td colspan=2 align=center><h3>訂單完成</h3>
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td width=100 align=center>桌號
				<td align=center><%=p.getDesk() %>
			<tr>
				<td width=100 align=center>1號(A餐)
				<td align=center><%=p.getA() %>
			<tr>
				<td width=100 align=center>2號(B餐)
				<td align=center><%=p.getB() %>
			<tr>
				<td width=100 align=center>3號(C餐)
				<td align=center><%=p.getC() %>
			<tr>
				<td width=100 align=center>共
				<td align=center><%=p.getSum() %>元
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td colspan=2 align=center>
				<DIV ALIGN="CENTER">
					<FORM>
						<INPUT NAME="print" TYPE="button" VALUE="列印此頁" ONCLICK="varitext()">
					</FORM>
				</DIV>				
				
		</table>
		
		
	<tr height=40>
		<td align=center><jsp:include page="b_OrderEnd.jsp"/>

</table>
</body>
</html>