<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<c:set var="fruits" value="사과#배#오렌지#바나나#망고#멜론" />

<c:forEach var="item" items="${fn:split(fruits, '#')}">
${item}<br>
</c:forEach>

<%
    String[] items = {"사과", "배", "오렌지", "바나나", "망고"};
%>
<c:set var="items" value="<%=items%>" />
${fn:join(items, '*')}<br>
${fn:length(items)}개<br>