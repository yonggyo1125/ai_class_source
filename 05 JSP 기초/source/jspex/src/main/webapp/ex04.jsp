<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List,java.time.*" %>
<%@ page import="java.util.Date" %>
<%@ page info="JSP 연습!" %>
<%
    List<String> items = List.of("사과", "배", "오렌지");
    out.write(items.toString());
    out.write("<br>");
%>
<%=getServletInfo()%>