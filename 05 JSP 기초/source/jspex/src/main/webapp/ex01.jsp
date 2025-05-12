<%@ page contentType="text/html; charset=UTF-8" %>
<%
    int num1 = 100;
    int num2 = 200;
    out.write("합계 : " + (num1 + num2));
    out.write("<br>");
    out.write(hello);

    // _jspService(..) 메서드 내부이므로 함수 등록 불가!
    //int add(int num1, int num2) {
    //    return num1 + num2;
    //}

    out.write("<br>");
    out.write("합계:" + add(50, 60));
%>

<%!
    String hello = "안녕하세요.";

    int add(int num1, int num2) {
        return num1 + num2;
    }
%>