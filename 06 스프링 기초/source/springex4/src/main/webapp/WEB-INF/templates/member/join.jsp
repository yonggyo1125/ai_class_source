<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/member/join" />

<h1>회원가입</h1>

<%--
<spring:message code="LOGIN_MSG" arguments="사용자01,user01@test.org" />
<spring:message code="LOGIN_MSG">
    <spring:argument value="사용자01" />
    <spring:argument value="user01@test.org" />
</spring:message>
--%>

<form:form action="${action}" modelAttribute="requestJoin">
    <form:errors />
    <dl>
        <dt>
            <spring:message code="이메일" />
        </dt>
        <dd>
            <form:input path="email" cssErrorClass="error" />
            <form:errors path="email" element="div" delimeter="" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="비밀번호" />
        </dt>
        <dd>
            <form:password path="password" />
            <form:errors path="password" element="div" delimeter=""  />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="비밀번호_확인" />
        </dt>
        <dd>
            <form:password path="confirmPassword" />
            <form:errors path="confirmPassword" element="div" delimeter="" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="회원명" />
        </dt>
        <dd>
            <form:input path="name" />
            <form:errors path="name" element="div" delimeter="" />
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
            <form:errors path="agree" element="div" delimeter="" />
        </dd>
    </dl>
    <button type="submit">가입하기</button>
</form:form>