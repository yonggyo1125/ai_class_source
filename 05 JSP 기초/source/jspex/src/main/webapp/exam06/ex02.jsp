<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="num" value="100" scope="page" />
<c:set var="num" value="200" scope="request" />
<c:set var="num" value="300" scope="application" />
pageScope.num: ${pageScope.num}<br>
requestScope.num: ${requestScope.num}<br>
applicationScope.num: ${applicationScope.num}<br>
<c:remove var="num" scope="application" />

pageScope.num: ${pageScope.num}<br>
requestScope.num: ${requestScope.num}<br>
applicationScope.num: ${applicationScope.num}<br>