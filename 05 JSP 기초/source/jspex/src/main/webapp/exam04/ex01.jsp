<%@ page contentType="text/html; charset=UTF-8" %>
<%
    pageContext.setAttribute("text1", "pageContext에서 설정");
    request.setAttribute("text2", "request에서 설정");
    application.setAttribute("text3", "application에서 설정");
%>
<%
    String text1 = (String)pageContext.getAttribute("text1");
    String text2 = (String)request.getAttribute("text2");
    String text3 = (String)application.getAttribute("text3");
%>
<h1>ex01.jsp</h1>
pageContext : <%=text1%><br>
request : <%=text2%><br>
application: <%=text3%><br>

<jsp:include page="ex02.jsp" />