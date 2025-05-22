<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/file/upload" />
<c:url var="action2" value="/file/upload2" />

<form method="POST" action="${action}" enctype="multipart/form-data">
    제목: <input type="text" name="subject"><br>
    내용: <textarea name="content"></textarea><br>
    첨부파일: <input type="file" name="attach"><br>
    <button type="submit">작성하기</button>
</form>

<form method="POST" action="${action2}" enctype="multipart/form-data">
    제목: <input type="text" name="subject"><br>
    내용: <textarea name="content"></textarea><br>
    첨부파일1: <input type="file" name="attach"><br>
    첨부파일22: <input type="file" name="attach"><br>
    <button type="submit">작성하기</button>
</form>

<form method="POST" action="${action2}" enctype="multipart/form-data">
    제목: <input type="text" name="subject"><br>
    내용: <textarea name="content"></textarea><br>
    첨부파일: <input type="file" name="attach" multiple><br>

    <button type="submit">작성하기</button>
</form>