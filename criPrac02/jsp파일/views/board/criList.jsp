<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="i" items="${list}">
		${i.seq} 
		${i.title} 	
		${i.id}
		${i.regdate}<br>
	</c:forEach>

	<div>
	<c:if test="${pm.prev}">
	<a href="criList${pm.makeQuery(pm.sPage-1)}"> [이전]</a>
	</c:if>
	
		<c:forEach var="i" begin="${pm.sPage}" end="${pm.ePage}">

			<a href="criList${pm.makeQuery(i)}"> ${i} </a>

		</c:forEach>
		
		<c:if test="${pm.next}">
	<a href="criList${pm.makeQuery(pm.ePage+1)}"> [다음]</a>
	</c:if>

	</div>
</body>
</html>