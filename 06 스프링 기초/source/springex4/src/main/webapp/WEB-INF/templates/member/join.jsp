<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/member/join" />

<h1>${commonTitle}</h1>

${requestJoin}

<form:form action="${action}" modelAttribute="requestJoin">
    <dl>
        <dt>이메일</dt>
        <dd>
            <form:input path="email" />
        </dd>
    </dl>
    <dl>
        <dt>비밀번호</dt>
        <dd>
            <form:password path="password" />
        </dd>
    </dl>
    <dl>
        <dt>비밀번호 확인</dt>
        <dd>
            <form:password path="confirmPassword" />
        </dd>
    </dl>
    <dl>
        <dt>회원명</dt>
        <dd>
            <form:input path="name" />
        </dd>
    </dl>
    <dl>
        <dt>휴대전화번호</dt>
        <dd>
            <form:input path="mobile" />
        </dd>
    </dl>
    <dl>
        <dt>주소</dt>
        <dd>
            <div>
                <form:input path="addr.zoneCode" />
            </div>
            <form:input path="addr.address" />
            <form:input path="addr.addressSub" />
        </dd>
    </dl>
    <dl>
        <dt>약관동의</dt>
        <dd>
            <form:checkbox path="agree" label="회원가입 약관에 동의합니다." />
        </dd>
    </dl>
    <button type="submit">가입하기</button>
</form:form>