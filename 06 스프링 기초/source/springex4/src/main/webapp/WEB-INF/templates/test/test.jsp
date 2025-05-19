<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form>
<dl>
    <dt>좋아하는 언어</dt>
    <dd>
        <form:checkboxes items="${programmings}" />
    </dd>
</dl>
<dl>
    <dt>좋아하는 과일</dt>
</dl>
</form:form>