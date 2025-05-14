<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
${param.num1} + ${param.num2} = ${param.num1 + param.num2}<br>
category : ${param.category}<br>
categories<br>
<c:forEach var="category" items="${paramValues.category}">
${category}<br>
</c:forEach>
User-Agent : ${header['user-agent']}<br>
JSESSIONID : ${cookie.JSESSIONID.getValue()}<br>
JSESSIONID : ${cookie.JSESSIONID.value}<br>
key1 : ${initParam.key1}<br>
key2 : ${initParam.key2}<br>