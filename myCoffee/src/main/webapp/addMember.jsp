<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<form action="addMemberController" method="post">
	<table width=400 align=center border=1>
		<tr>
			<td colspan=2 align=center><h3>註冊</h3>
		<tr>
			<td width=100 align=center>姓名
			<td><input type="text" name="name">
		<tr>
			<td width=100 align=center>帳號
			<td><input type="text" name="username">
		<tr>
			<td width=100 align=center>密碼
			<td><input type="password" name="password">
		<tr>
			<td width=100 align=center>地址
			<td><input type="text" name="address">
		<tr>
			<td width=100 align=center>電話
			<td><input type="text" name="phone">
		<tr>
			<td width=100 align=center>行動
			<td><input type="text" name="mobile">
		<tr>
			<td colspan=2 align=center>
			<input type="submit" value="註冊">
	
	</table>
</form>

</body>
</html>