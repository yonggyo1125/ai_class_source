<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form modelAttribute="requestForm">
<dl>
    <dt>좋아하는 언어</dt>
    <dd>
        <form:checkboxes items="${programmings}" path="programming" />
    </dd>
</dl>
<dl>
    <dt>좋아하는 과일</dt>
    <dd>
        <form:select items="${fruits}" path="fruit" />
    </dd>
</dl>
<dl>
    <dt>성별</dt>
    <dd>
        <form:radiobuttons items="${genders}" path="gender" />
    </dd>
</dl>
</form:form>