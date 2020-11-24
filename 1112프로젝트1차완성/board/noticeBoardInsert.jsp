<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="kn">
<head>
<link rel="stylesheet" href="resources/css/reset.css">
<link rel="stylesheet" href="resources/css/board/nbinsert.css">
<meta charset="UTF-8">
<title>수정!</title> 
<style>
</style>
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

			<span>공지사항</span>

		</div>
		<div id="tableDiv">
			<form action="nbinsert">
				<table>
					<tr>
						<td>제 목</td>
					</tr>
					<tr>
						<td>
							<input type="text" name="title" id="titleInput">
						</td>
					</tr>
					<tr>
						<td>내 용</td>
					</tr>
					<tr>
						<td id="contents">
							학번 : <input type="text" name="studentId" > 
							<textarea rows="40rem" cols="140rem" name="contents"></textarea>
						</td>
					</tr>
				</table>
				<input type="submit" value="작성">
			</form>
		</div>
		<div id="directionDiv">
			<button onclick="location.href='nblist'">목록</button>


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
