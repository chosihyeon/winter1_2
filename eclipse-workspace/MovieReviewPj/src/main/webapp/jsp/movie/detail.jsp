<%@page import="kr.ac.kopo.vo.MovieVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.ac.kopo.dao.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
MovieVO movie =(MovieVO)request.getAttribute("movie");

%>

<html>
<head>
<meta charset="UTF-8">
<title>지브리피디아</title>
</head>
<body>
  <h1>영화 상세 페이지</h1>
    <p>테스트 데이터 출력</p>
    <p>${movie.title}</p>
	<h2>${movie.movie_title}상세 페이지</h2>
		<img src="${movie.movie_poster}" alt="${movie.movie_title}"/>
		${movie.movie_runtime}
		${movie.movie_platform}
		${movie.release_date}
		${movie.rating_avg}
	
</body>
</html>