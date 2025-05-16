<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%
    Date date = new Date();
%>
<c:set var="date" value="<%=date%>" />
<h3>서울</h3>
<fmt:setTimeZone value="Asia/Seoul" />
<fmt:formatDate value="${date}" type="both" />


<h3>홍콩</h3>
<fmt:setTimeZone value="Asia/Hong_Kong" />
<fmt:formatDate value="${date}" type="both" />


<h3>런던</h3>
<fmt:setTimeZone value="Europe/London" />
<fmt:formatDate value="${date}" type="both" />


<h3>뉴욕</h3>
<fmt:setTimeZone value="America/New_York" />
<fmt:formatDate value="${date}" type="both" />
