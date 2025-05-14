<%@ page contentType="text/html; charset=UTF-8" %>
<%
    pageContext.setAttribute("num", 100);
    request.setAttribute("num", 200);
    application.setAttribute("num", 300);
%>
num : ${num}<br>
pageScope : ${pageScope.num}<br>
requestScope : ${requestScope.num}<br>
applicationScope : ${applicationScope.num}<br>