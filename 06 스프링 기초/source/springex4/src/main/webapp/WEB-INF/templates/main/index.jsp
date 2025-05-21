<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:if test="${loggedMember == null}">
    <a href="<c:url value='/member/join' />">회원가입</a>
    <a href="<c:url value='/member/login' />">로그인</a>
</c:if>
<c:if test="${loggedMember != null}">
    <spring:message code="LOGIN_MSG" arguments="${loggedMember.name},${loggedMember.email}" />
    <a href="<c:url value='/member/logout' />">로그아웃</a>
</c:if>