<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>update</title>
</head>
<body>
<center>
<hr width='600' size='2' noshade>
<h2>수정</h2>
<a href='list'>글목록</a>
<hr width='600' size='2' noshade>
</center>
<form name='update' method='post' action='update2'>
<input type='hidden' name='id' value='${id}'>

<table border='1' width='600' align='center' cellpadding='3' cellspacing='1'><tr>
<td width='30%' align='center'>글쓴이</td>
<td align='center'><input type='text' name='name' size='60' value='${name}' disabled></td>
</tr>
<tr>
<td width='30%' align='center'>글제목</td>
<td align='center'><input type='text' name='subject' size='60' value='${subject}'></td>
</tr>
<tr>
<td width='30%' align='center'>글내용</td>
<td align='center'><textarea name='content' rows='5' cols='53'>${content}</textarea></td>
</tr>
<tr>
<td colspan='2' align='center'>
<input type='submit' value='수정'>
</td>
</tr>
</table>
</body>
</html>