<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url var="action" value="/survey/done" />
<form:form action="${action}" modelAttribute="requestSurvey">
    문항7. <form:input path="q7" /><br>
    문항8. <form:input path="q8" /><br>
    문항9. <form:input path="q9" /><br>
    <button type='submit'>설문지 제출하기</button>
</form:form>