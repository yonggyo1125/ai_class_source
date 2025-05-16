<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<fmt:setLocale value="ko_kr" />
<fmt:setBundle basename="messages.commons" />
<fmt:message var="title" key="SITE_TITLE" />
<fmt:message var="greeting" key="GREETING" />

<h1>${title}</h1>
<h2>${greeting}</h2>
<h3>
    <fmt:message key="LOGIN_MSG">
        <fmt:param>이이름</fmt:param>
        <fmt:param>user01@test.org</fmt:param>
    </fmt:message>
</h3>
