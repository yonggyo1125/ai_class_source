<%@ page contentType="text/html; charset=UTF-8" %>
<h1>ex04.jsp - 상단</h1>

<jsp:include page="ex03.jsp">
    <jsp:param name="num1" value="100" />
    <jsp:param name="name" value="이이름" />
</jsp:include>

<h1>ex04.jsp - 하단</h1>