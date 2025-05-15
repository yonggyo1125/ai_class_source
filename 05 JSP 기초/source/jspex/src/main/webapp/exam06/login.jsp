<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value='/exam06/login_ps.jsp' />
<form method="POST" action="${action}">
    이메일: <input type="text" name="email"><br>
    비밀번호: <input type="password" name="password"><br>
    <button type="submit">로그인</button>
</form>
<a href="${action}">로그인 처리 페이지</a>