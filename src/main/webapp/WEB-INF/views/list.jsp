<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body style='text-align:center'>
	<h1>글 목록</h1>
	<br>전체 글 수: ${count }
<a href='write'>글쓰기</a><br/>
<table border='1' width='50%' cellpadding='5' align='center'>

	<tr>	
	<th>글번호</th> 
	<th>이름</th>
	<th>제목</th>
	<th>날짜</th>
	</tr>
	
	<c:forEach items="${list}" var="guestbook">
	<tr>
	
	<td>${guestbook.id }</td>
	<td>${guestbook.name }</td>
	<td><a href='detail?id=${guestbook.id}'>${guestbook.subject }</td>
	<!-- id로 상세페이지를 구분해 줘야함. -->
	<td>${guestbook.regdate }</td>
	</tr>
	</c:forEach>
	<br>
	
	<c:forEach items="${pageStartList}" var="pageIndex" varStatus="status">
		<a href="list?start=${pageIndex}">${status.index +1 }</a>&nbsp; &nbsp;
	</c:forEach>
	
</table>

</body>
</html>
