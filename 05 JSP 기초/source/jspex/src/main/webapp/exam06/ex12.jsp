<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="naverUrl" value="https://www.naver.com">
    <c:param name="num1" value="100" />
    <c:param name="num2" value="200" />
</c:url>

<a href="${naverUrl}">네이버</a>