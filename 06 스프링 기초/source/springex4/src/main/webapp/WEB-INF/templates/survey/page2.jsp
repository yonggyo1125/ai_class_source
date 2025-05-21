<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url var="action" value="/survey/page3" />
<form:form action="${action}" modelAttribute="requestSurvey">
    문항4. <form:input path="q4" /><br>
    문항5. <form:input path="q5" /><br>
    문항6. <form:input path="q6" /><br>
    <button type='submit'>다음 페이지</button>
</form:form>