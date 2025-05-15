<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="text1" value="사과,배#오렌지~망고,바나나" />
<c:forTokens var="item" items="${text1}" delims=",#~">
    ${item}<br>
</c:forTokens>
num1: ${param.num1}<br>
num2: ${param.num2}<br>