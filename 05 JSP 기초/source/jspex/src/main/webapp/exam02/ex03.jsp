<%@ page contentType="text/html; charset=UTF-8" %>
<h1>ex03.jsp</h1>
<%
String num1 = request.getParameter("num1");
String name = request.getParameter("name");
%>
num1: <%=num1%><br>
name: <%=name%><br>