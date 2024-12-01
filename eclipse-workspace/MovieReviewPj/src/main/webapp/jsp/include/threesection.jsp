<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

%>
    
  <style>
    * {
      margin: 0 auto;
      padding: 7px;
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
      width: 200px;
      height: 280px;
      background-color: white;
      display:flex;
      margin: 5px; 
      }
      
</style>


<section>
	<div class = "container">
	      <div class="card"></div>
	      <div class="card"></div>
	      <div class="card"></div>
	</div>
</section>