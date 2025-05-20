<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/member/join" />

<h1>회원가입</h1>

<form:form action="${action}" modelAttribute="requestJoin">
    <dl>
        <dt>
            <spring:message code="이메일" />
        </dt>
        <dd>
            <form:input path="email" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="비밀번호" />
        </dt>
        <dd>
            <form:password path="password" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="비밀번호_확인" />
        </dt>
        <dd>
            <form:password path="confirmPassword" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="회원명" />
        </dt>
        <dd>
            <form:input path="name" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="휴대전화번호" />
        </dt>
        <dd>
            <form:input path="mobile" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="약관동의" />
        </dt>
        <dd>
            <form:checkbox path="agree" label="회원가입 약관에 동의합니다." value="true" />
        </dd>
    </dl>
    <button type="submit">가입하기</button>
</form:form>