<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!DOCTYPE html>
<html lang="kn">

<head>
    <link rel="stylesheet" href="resources/css/reset.css">
    <link rel="stylesheet" href="resources/css/board/nbdetail.css">
    <meta charset="UTF-8">
    <title>디테일</title>
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
                <table>
                    <tr>
                        <td>제 목</td>

                    </tr>
                    <tr>
                        <td>${vo.title}</td>
                    </tr>
                    <tr>
                        <td>내 용</td>
                    </tr>
                    <tr>
                        <td id="contents">
                            <span>글쓴이:${vo.studentId} 작성일: ${vo.regDate}</span>
                            ${vo.contents}
                        </td>
                    </tr>
                </table>
            </div>
            <div id="directionDiv">
                <span>댓글</span>
                <button onclick="location.href='nblist'">목록</button>
                <button onclick="location.href='nbupdatef?seq=${vo.seq}'">수정</button>
                <button onclick="location.href='nbdelete?seq=${vo.seq}'">삭제</button>
            </div>
            <div id="commentDiv">
            <c:forEach items="${clist}" var="clist">
                <table> 
                    <tr>  
                        <td>${clist.studentId }<span>${clist.regDate}</span>
                        <a href="nbcdelete?seq=${clist.seq}&root=${clist.root}">x</a></td>
                    </tr>
                    <tr>
                        <td>${clist.contents}</td>
                    </tr>
                </table>
                </c:forEach>
            </div>
            <div id="commentInsertDiv">
                <form action="nbcinsert">
                	<input type="hidden" value="${vo.seq}" name="seq"> 
                    <input type="text" placeholder="아이디" name="studentId"><br>
                    <input type="text" placeholder="악성댓글 ㄴㄴ"name="contents">
                    <input type="submit" value="작성">
                    
                </form>
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
                    <li><a href="#" class="a1">개인정보처리방침</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;<a href="#">교내전화번호</a>
                    </li>
                    <li><a href="#">이메일무단수집거부</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">학내백신다운로드</a></li>
                    <li><a href="#">오시는길</a></li>
                </ul>
            </div>
        </footer>
    </div>
</body>

</html>
