<%@ page contentType="text/html; charset=UTF-8" %>
${100 gt 200 ? "크다" : "작다"}<br>
${empty param.str ? "값이 없음" :  param.str}<br>
${!empty param.str ? param.str : "값이 없음"}<br>