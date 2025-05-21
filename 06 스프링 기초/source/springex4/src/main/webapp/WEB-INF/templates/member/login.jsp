<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:url var="action" value="/member/login" />
<spring:message var="saveEmail" code="아이디_저장하기" />

<form:form action="${action}" modelAttribute="requestLogin">
    <form:hidden path="redirectUrl" />
    <dl>
        <dt>
            <spring:message code="이메일" />
        </dt>
        <dd>
            <form:input path="email" />
            <form:errors path="email" element="div" delimiter="" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="비밀번호" />
        </dt>
        <dd>
            <form:password path="password" />
            <form:errors path="password" element="div" delimiter="" />
        </dd>
    </dl>
    <div>
        <form:checkbox path="saveEmail" value="true" label="${saveEmail}" />
    </div>
    <button type="submit">
        <spring:message code="로그인" />
    </button>
     <form:errors element="div" delimiter="" />
</form:form>