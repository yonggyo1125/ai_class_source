<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="age" value="12" />
<c:choose>
    <c:when test="${age < 8}">
        유치원
    </c:when>
    <c:when test="${age < 14}">
        초등학생
    </c:when>
    <c:when test="${age < 17}">
        중학생
    </c:when>
    <c:when test="${age < 20}">
        고등학생
    </c:when>
    <c:otherwise>
        성인
    </c:otherwise>
</c:choose>