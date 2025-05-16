<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%
    Date date = new Date();
%>
<c:set var="date" value="<%=date%>" />
<fmt:formatDate value="${date}" /><br>
<fmt:formatDate value="${date}" type='time' /><br>
