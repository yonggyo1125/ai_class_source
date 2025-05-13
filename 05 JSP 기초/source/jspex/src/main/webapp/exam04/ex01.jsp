<%@ page contentType="text/html; charset=UTF-8" %>
<%
    pageContext.setAttribute("text1", "pageContext에서 설정");
    request.setAttribute("text2", "request에서 설정");
%>
<jsp:include page="ex02.jsp" />