<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="${cp}/resources/view/JavaScript/list.js"></script>
<title>게시글 작성</title>
</head>
<body>
	<form id="regiForm">
		<table>
			<tr>
				<td><input type="text" placeholder="제목" id="subject" name="subject"></td>
				<td><input type="text" placeholder="작성자" id="name" name="name"></td>
				<td><input type="text" placeholder="내용" id="content" name="content"></td>
				<td><button type="button" onclick="regiAjax();">등록</button></td>
			</tr>
		</table>
	</form>
</body>
</html>