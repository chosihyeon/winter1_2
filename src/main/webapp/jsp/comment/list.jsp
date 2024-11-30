<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.ac.kopo.dao.CommentDAO" %>
<%@ page import="kr.ac.kopo.vo.CommentVO" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
	CommentDAO dao = new CommentDAO();
	List<CommentVO> commentList = dao.selectAll();
	
	pageContext.setAttribute("commentList",commentList);
--%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<!--  <meta http-equiv="X-UA-Compatible"content="IE=edge">-->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>지브리피디아</title>
</head>
<body>
	<h2>댓글디테일 페이지 형태는 인스타그램 좋아요 형식</h2>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>영화명</th>
			<th>댓글</th>
			<th>작성일</th>
		</tr>
	<!-- commentcontroller에서 request 설정하는 부분 -->
	<c:forEach items="${commentList}" var ="CommentVO">
		<tr>
			<td>${CommentVO.comment_no }</td>
			<td><c:out value="${CommentVO.movie_title}"/></td>
			<td>${CommentVO.reply}</td>
			<td>${CommentVO.comment_create_date }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>