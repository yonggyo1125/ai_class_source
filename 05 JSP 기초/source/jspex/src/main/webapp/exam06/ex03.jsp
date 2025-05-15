<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:if test="${param.NUM1 - param.NUM2 >= 0}">
    ${param.NUM1}
</c:if>
<c:if test="${!(param.NUM1 - param.NUM2 >= 0)}">
    ${param.NUM2}
</c:if>
<c:if test="true">
    <h1>무조건 참</h1>
</c:if>