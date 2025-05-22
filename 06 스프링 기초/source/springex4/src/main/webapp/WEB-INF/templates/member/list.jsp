<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url var="action" value="/member/list" />

<form:form method="GET" action="${action}" autocomplete="off" modelAttribute="memberSearch">
    <form:input path="sDate" /> ~
    <form:input path="eDate" />
    <button type="submit">조회하기</button>
</form:form>