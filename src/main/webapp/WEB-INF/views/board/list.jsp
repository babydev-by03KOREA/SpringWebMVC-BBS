<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${cp}/resources/view/css/list.css" />
<script src="${cp}/resources/view/JavaScript/list.js"></script>
<title>BoardList</title>
</head>
<body>
	<section>
	<form id="frm">
		<h3>&copy; ${dev}</h3>
		<button id = "writebtn" onclick="writeDo();">글쓰기</button>
		<table>
			<thead>
				<tr>
					<td>번호</td>
					<td>제목</td>
					<td>내용</td>
					<td>작성자</td>
					<td>작성날짜</td>
					<td>조회수</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="list">
					<tr>
						<td>${list.seq}</td>
						<td>${list.subject}</td>
						<td>${list.content}</td>
						<td>${list.name}</td>
						<td>${list.reg_date}</td>
	 				 	<td>${list.readCount}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</form>
	</section>	
</body>
</html>