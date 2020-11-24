<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<script src="resources/jqLib/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" href="resources/css/reset.css">
<link rel="stylesheet" href="resources/css/board/nboardList.css">

<script>
	$(function() {
		$('#searchBtn').click(
				function() {
					location.href = "nblist" + "${pm.makeQuery(1)}"
							+ "&searchType=" + $('#searchType').val()
							+ "&keyword=" + $('#keyword').val();
				});//click
	});//ready
</script>

</head>

<body>
	<div>
		<header>
			<div>
				<img src="resources/image/hoseologo2.png">
			</div>
		</header>
		<main>
		<div id="searchDiv">
			<div>
				<input type="button" value="글쓰기" onclick="location.href='nbinsertf'">
			</div>
			<div>
				<select id="searchType">
					<option value="t">제목</option>
					<option value="c">콘텐츠</option>
					<option value="i">작성자</option>
				</select>
				<input type="text" id="keyword"> <input type="button" value="검색" id="searchBtn">
			</div>
		</div>
		<div id="tableDiv">
			<table>
				<tr>
					<td>번 호</td>
					<td id="title">제 목</td>
					<td>작성자</td>
					<td>작성일</td>
					<td>조회수</td>
				</tr>
				<c:forEach items="${list}" var="list">
					<tr>
						<td>${list.seq}</td>
						<td>
							<a href="nbdetail?seq=${list.seq}">${list.title}</a>
						</td>
						<td>${list.studentId}</td>
						<td>${list.regDate }</td>
						<td>${list.count}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div id="pagingDiv">
			<div>
				<c:if test="${pm.prev}">
					<button onclick="location.href='nblist?currPage=${pm.sPage-1}'"  id="prev">이전</button>
				</c:if>
				<c:forEach begin="${pm.sPage}" end="${pm.ePage }" var="i">
				
				<c:if  test="${pm.cri.currPage == i }">
				<button onclick="location.href='nblist${pm.searchQuery(i)}'" style="background-color: gray">${i}</button>
				</c:if>
				<c:if  test="${pm.cri.currPage != i }">
					<button onclick="location.href='nblist${pm.searchQuery(i)}'">${i}</button>
			</c:if>
				</c:forEach>
<c:if test="${pm.next}">
				<button onclick="location.href='nblist?currPage=${pm.ePage+1}'" id="next">다음</button>
				</c:if>
			</div>

		</div>
		</main>
		<footer>
			<img src="resources/image/hoseologo1.png" width="140" height="50">

			<div>
				<ul>
					<li><span>은혜캠퍼스</span> 충청남도 아산시 배방읍 호서로79번길20 (우)31499 TEL:041-540-5114</li>
					<li><span>승빈캠퍼스</span> 충청남도 천안시 동남구 호서대길12 (우)31066 TEL:041-560-8114</li>
					<li><span>민혁캠퍼스</span> 충청남도 천안시 배방읍 호서대길12 (우)31499 TEL:041-560-8115</li>
				</ul>
				<span>COPYRIGHT(C) 2011 HOSEO UNIVERSITY. ALL RIGHT RESERVED</span>
			</div>

			<div>
				<ul>
					<li><a href="#" class="a1">개인정보처리방침</a> &nbsp;&nbsp;&nbsp;&nbsp;<a href="#">교내전화번호</a></li>
					<li><a href="#">이메일무단수집거부</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">학내백신다운로드</a></li>
					<li><a href="#">오시는길</a></li>
				</ul>
			</div>
		</footer>
	</div>
</body>



</html>