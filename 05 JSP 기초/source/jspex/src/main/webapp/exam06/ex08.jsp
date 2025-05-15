<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%
    int num1 = 100;
    int num2 = 0;
%>
<c:catch var="e">
<%
    int result = num1 / num2;
    out.write("결과:" + result);
%>
</c:catch>
<c:if test="${e != null}">
     에러 메세지: ${e.message}<br>
</c:if>