<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardList</title>
</head>
<body>
	<section>
		<h3>&copy; ${dev}</h3>
		<table>
			<thead>
				<tr>
					<td>게시글 번호</td>
					<td>게시글 제목</td>
					<td>게시글 내용</td>
					<td>게시글 작성자</td>
					<td>게시글 작성날짜</td>
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
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>	
</body>
</html>