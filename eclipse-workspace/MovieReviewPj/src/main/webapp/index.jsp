<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>지브리 피디아</title>
	<link rel ="stylesheet" href="/MovieReview/resources/css/layout.css">
</head>
<body>

	<jsp:include page="/jsp/include/topMenu.jsp"/>
	
	<!-- <jsp:include page="/jsp/include/fivesection.jsp"/>
	<jsp:include page="/jsp/include/fivesection.jsp"/> -->
	
	<c:forEach var ="i" begin="1" end="2">
		<jsp:include page="/jsp/include/fivesection.jsp"/>
	</c:forEach>
	
	<jsp:include page="/jsp/include/threesection.jsp"/>
	
	<jsp:include page="/jsp/include/map.jsp"/>
	
	<footer>
		<%@ include file="/jsp/include/footer.jsp"%>
	</footer>
	 
</body>
</html>

