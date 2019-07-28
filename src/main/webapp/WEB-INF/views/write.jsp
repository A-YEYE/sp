<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style='text-align:center'>
	<h1>글 쓰기</h1>
	<form name="input" method="post" action="list">
	   <table border="1" width="600" align="center"  cellpadding="3" cellspacing="1">
	      <tr>
		     <td width="30%" align="center">글쓴이</td>
			 <td align="center"><input type="text" name="name" size="60"></td>
		  </tr>
          <tr>
		     <td align="center">글제목</td>
			<td align="center"><input type="text" name="subject" size="60"></td>
		  </tr>
		  <tr>
		     <td align="center">글내용</td>
			 <td align="center"><textarea name="content" rows="5" cols="53"></textarea></td>
		  </tr>
		  <tr>
		     <td colspan="2" align="center">
			    <input type="submit" value="전송" onclick="check()">
				<input type="reset" value="다시입력" onclick="input.writer.focus()"/>
			 </td>
		  </tr>
	   </table>
</body>
</html>