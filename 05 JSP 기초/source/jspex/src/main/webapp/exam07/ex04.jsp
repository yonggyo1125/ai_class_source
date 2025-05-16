<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%
    Date date = new Date();
%>
<c:set var="date" value="<%=date%>" />
<h3>우리나라의 형식</h3>
<fmt:setLocale value="ko_kr" />
금액: <fmt:formatNumber value="10000" type="currency" /><br>
일시: <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>

<h3>미국의 형식</h3>
<fmt:setLocale value="us_en" />
금액: <fmt:formatNumber value="10000" type="currency" /><br>
일시: <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>

<h3>일본의 형식</h3>
<fmt:setLocale value="ja_jp" />
금액: <fmt:formatNumber value="10000" type="currency" /><br>
일시: <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>