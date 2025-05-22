<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url var="action" value="/member/list" />

<h1>회원 검색</h1>
<form:form method="GET" action="${action}" autocomplete="off" modelAttribute="memberSearch">
    <form:input path="sDate" />
    <form:errors path="sDate" />
     ~
    <form:input path="eDate" />
    <form:errors path="eDate" />
    <button type="submit">조회하기</button>
</form:form>

<h2>회원목록</h2>
<ul>
    <c:forEach var="item" items="${items}">
        <li>
            ${item.email} / ${item.name}
        </li>
    </c:forEach>
</ul>