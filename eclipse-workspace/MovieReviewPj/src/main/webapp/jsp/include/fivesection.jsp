<%@page import="kr.ac.kopo.vo.MovieVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.ac.kopo.dao.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	MovieDAO dao = new MovieDAO();
	List<MovieVO> movieList	=dao.movieSelectAll();
	pageContext.setAttribute("movieList",movieList);

%>
<%

%>
  <style>
    * {
      margin: 0 auto;
      padding: 2px;
    }

    .container { 
      width: 90%;
      max-width: 1200px;
      min-width: 370px;
      background-color: gainsboro;
      text-align: center;
      display:flex;
      justify-content: center;
      flex-wrap: wrap;
    }
    
    span{
    	display: inline-block;
    	margin:5px;
    
    }

  	.card {
      width: 80px;
      height: 280px;
      background-color: white;
      /*display:flex;*/
	  display:table !important;
      margin: 3px; 
      }
     
     .card > *{
	  margin: 0px;
	  padding: 0px !important;     
     }

     img{
    	width: 180px;
    	height: 240px;
     }
</style>

<section>
	<div class = "container">
		<c:forEach items="${movieList}" var="movieVO">
		      <div class="card">
		      	<div style="background:red">${movieVO.movie_title}</div>
		      	<br>
		      	 
			      <div style="background:green">
			      <a href="/MovieReviewPj/movie/list.do?movie_title=${movieVO.movie_title}">
		      	<img src="${movieVO.movie_poster}" alt="${movieVO.movie_title}"/>
		      	</a>
			      </div>
		      	<br>
		      	<p style="background:blue">평점:${movieVO.rating_avg}</p>
		      </div>
	      </c:forEach>
     </div>
</section>