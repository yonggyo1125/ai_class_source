<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/member/join" />

<h1>회원가입</h1>
<form method="POST" action="${action}">
    <dl>
        <dt>이메일</dt>
        <dd>
            <input type="text" name="email" value="${requestJoin.email}">
        </dd>
    </dl>
    <dl>
        <dt>비밀번호</dt>
        <dd>
            <input type="password" name="password" value="${requestJoin.password}">
        </dd>
    </dl>
    <dl>
        <dt>비밀번호 확인</dt>
        <dd>
            <input type="password" name="confirmPassword" value="${requestJoin.confirmPassword}">
        </dd>
    </dl>
    <dl>
        <dt>회원명</dt>
        <dd>
            <input type="text" name="name" value="${requestJoin.name}">
        </dd>
    </dl>
    <dl>
        <dt>약관동의</dt>
        <dd>
            <input type="checkbox" name="agree" value="true" id="agree"${requestJoin.agree ? ' checked': ''}>
            <label for="agree">약관에 동의합니다.</label>
        </dd>
    </dl>
    <button type='submit'>가입하기</button>
</form>