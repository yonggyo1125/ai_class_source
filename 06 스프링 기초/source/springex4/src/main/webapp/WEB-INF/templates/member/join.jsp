<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/member/join" />

<h1>회원가입</h1>

<form:form action="${action}" modelAttribute="requestJoin">
    <dl>
        <dt>
            <spring:message code="email" />
        </dt>
        <dd>
            <form:input path="email" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="password" />
        </dt>
        <dd>
            <form:password path="password" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="confirmPassword" />
        </dt>
        <dd>
            <form:password path="confirmPassword" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="name" />
        </dt>
        <dd>
            <form:input path="name" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="mobile" />
        </dt>
        <dd>
            <form:input path="mobile" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="termsAgree" />
        </dt>
        <dd>
            <form:checkbox path="agree" label="회원가입 약관에 동의합니다." value="true" />
        </dd>
    </dl>
    <button type="submit">가입하기</button>
</form:form>