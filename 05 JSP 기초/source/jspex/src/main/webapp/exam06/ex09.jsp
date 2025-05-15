<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<h1>ex09.jsp</h1>
<c:redirect url="ex08.jsp">
    <c:param name="num1" value="100" />
    <c:param name="num2" value="200" />
</c:redirect>