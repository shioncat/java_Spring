<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../../../LoginController" method="post">
	<table width=400 align=center border=1>
		<tr>
			<td colspan=2 align=center><h3>員工訂單管理系統登入</h3>
			現在時刻: ${ time }
		<tr>
			<td width=100 align=center>帳號
			<td><input type="text" name="username">
		<tr>
			<td width=100 align=center>密碼
			<td><input type="text" name="password">
		<tr>
			<td colspan=2 align=center>
			<input type="submit" value="登入">
			
			
	</table>

</form>
</body>
</html>