<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home</title>
<script src="resources/jqLib/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" href="resources/css/home.css">
</head>
<body>
	<form action="" method="get">
		<header>
			<img src="resources/image/main.png" width=100% height=30%>
		</header>
		<div id="div1">
			<div id="div2">
				<section>
					<h2>로 그 인</h2>
					<tr>
						<td><input type="text" id="id" name="id" class="inputbox"
							placeholder="학번 입력"></td>
						<td><input type="checkbox"><span>학번/교번 저장</span></td>
						<br>
					</tr>
					<tr>
						<td><input type="password" id="password" name="password"
							class="inputbox" placeholder="비밀번호 입력"></td>
						<td><input type="submit" value="로그인" id="logbtn"></td>
						<br>
					</tr>
					<tr>
						<a href="#">학번/교번 찾기</a>
						<a href="joinf">회원가입</a>
					</tr>
				</section>
			</div>
			<div id="div3">
				<ul>
					<li><a href="nblist">공지사항</a></li>
					<li><a href="qblist">문의사항</a></li>
					<ul>
						<li><a href="nbdetail">[교수학습센터] 2020-2학기 학습법워크숍·학습성찰일지워크숍 추가..</a><span>2020-10-27</span></li>
						<li><a href="nbdetail">[국제협력원] 코로나-19확산에 따른 해외연수 미실시 안내</a><span>2020-10-26</span></li>
						<li><a href="nbdetail">[LINC+사업단]2020학년도 LINC+사업단 캡스톤디자인실 또는
								Adven..</a><span>2020-10-26</span></li>
						<li><a href="nbdetail">[공학교육혁신센터] 파이썬(스텍코딩)과정, PLC프로그래밍 과정 참여..</a><span>2020-10-26</span></li>
						<li><a href="nbdetail">2020학년도 2학기 중소기업 취업연계 장학금 신청 (희망사다리 장학금..</a><span>2020-10-26</span></li>
						<li><a href="nbdetail">[대학일자리센터] 취업준비생이 알아야 하는 노동법 특강 안내</a><span>2020-10-23</span></li>
						<li><a href="nbdetail">[LINC+사업단] 2020년 산학협력 페스티벌 Venture 1st
								UNISTRY DAY..</a><span>2020-10-23</span></li>
					</ul>
				</ul>
			</div>
		</div>
		<footer>
			<div>
				<ul>
					<li><a href="#" class="a1">개인정보처리방침</a></li>
					<li><a href="#">이메일무단수집거부</a></li>
					<li><a href="#">오시는길</a></li>
					<li><a href="#">교내전화번호</a></li>
					<li><a href="#">학내백신다운로드</a></li>
					<ul>
						<img src="resources/image/hoseologo6.png">
						<ul>
							<li>은혜캠퍼스 충청남도 아산시 배방읍 호서로79번길20 (우)31499 TEL:041-540-5114</li>
							<li>승빈캠퍼스 충청남도 천안시 동남구 호서대길12 (우)31066 TEL:041-560-8114</li>
							<li>민혁캠퍼스 충청남도 천안시 배방읍 호서대길12 (우)31499 TEL:041-560-8115</li>
							<li>COPYRIGHT(C) 2011 HOSEO UNIVERSITY. ALL RIGHT RESERVED</li>
						</ul>
					</ul>
				</ul>
			</div>
		</footer>
	</form>
</body>
</html>