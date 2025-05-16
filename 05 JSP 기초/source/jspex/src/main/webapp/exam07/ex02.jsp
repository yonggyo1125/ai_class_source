<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%
    Date date = new Date();
%>
<c:set var="date" value="<%=date%>" />
[S] <fmt:formatDate value="${date}" type="both" dateStyle='short' timeStyle='short' /><br>
[M] <fmt:formatDate value="${date}" type="both" dateStyle='medium' timeStyle='medium' /><br>
[L] <fmt:formatDate value="${date}" type="both" dateStyle='long' timeStyle='long' /><br>
[F] <fmt:formatDate value="${date}" type="both" dateStyle='full' timeStyle='full' /><br>
[P] <fmt:formatDate value="${date}" type="both" pattern="yy/MM/dd (E) a hh:mm" />