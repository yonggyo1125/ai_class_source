<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%
    Date date = new Date();
%>
<c:set var="date" value="<%=date%>" />
<h3>서울</h3>
<fmt:timeZone value="Asia/Seoul">
    <fmt:formatDate value="${date}" type="both" />
</fmt:timeZone>

<h3>홍콩</h3>
<fmt:timeZone value="Asia/Hong_Kong">
    <fmt:formatDate value="${date}" type="both" />
</fmt:timeZone>

<h3>런던</h3>
<fmt:timeZone value="Europe/London">
    <fmt:formatDate value="${date}" type="both" />
</fmt:timeZone>

<h3>뉴욕</h3>
<fmt:timeZone value="America/New_York">
    <fmt:formatDate value="${date}" type="both" />
</fmt:timeZone>