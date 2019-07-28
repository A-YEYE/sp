<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detail</title>
</head>
<body style='text-align:center'>
<h1>상세 페이지</h1>
	<form name="view" method="get" action="list">
	   <table border="1" width="600" align="center"  cellpadding="3" cellspacing="1">

	     <tr>
		<th >글번호</th>
		<td>${id}</td> 
		</tr>
		<tr>
		<th >글쓴이</th>
		<td>${name}</td>
		</tr>
		<tr>
		<th >글제목</th>
		<td>${subject}</td>
		</tr>
		<tr>
		<th>글내용</th>
		<td>${content}</td>
		</tr>
		
		
		<a href='update?id=${id}'>수정</a>
		<a href='delete?id=${id}'>삭제</a>
		<a href='list.do'>목록</a>
	   </table>
</body>
</html>