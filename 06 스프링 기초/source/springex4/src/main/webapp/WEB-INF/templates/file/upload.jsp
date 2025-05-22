<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/file/upload" />

<form method="POST" action="${action}">
    제목: <input type="text" name="subject"><br>
    내용: <textarea name="content"></textarea><br>
    첨부파일: <input type="file" name="attach"><br>
    <button type="submit">작성하기</button>
</form>