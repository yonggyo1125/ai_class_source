<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%
    String[] fruits2 = {"사과","오렌지","배","바나나"};
%>
<c:set var="fruits" value="사과,오렌지,배,바나나" />
<c:set var="fruits2" value="<%=fruits2%>" />
<c:forEach var="item" items="${fruits}">
${item}<br>
</c:forEach>

<c:forEach var="item" items="${fruits2}">
    ${item}<br>
</c:forEach>