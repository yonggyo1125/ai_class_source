<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%
    int num1 = 100;
    int num2 = 200;
%>
<c:set var='num' value='100' scope="application" />
<c:set var='num2' value='<%=num2%>' />
<c:set var='num3' value='<%=num1 + num2%>' />
<c:set var='num4' value='${num + 200}' />
${num}<br>
pageScope: ${pageScope.num}<br>
requestScope: ${requestScope.num}<br>
applicationScope: ${applicationScope.num}<br>
num2: ${num2}<br>
num3: ${num3}<br>
num4: ${num4}<br>