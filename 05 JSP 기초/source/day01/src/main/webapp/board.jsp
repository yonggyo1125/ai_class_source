<%@ page contentType="text/html; charset=UTF-8" %>
<form method="POST" action="board_ps.jsp" enctype="multipart/form-data">
    제목 : <input type="text" name="subject"> <br>
    내용 : <textarea name="content"></textarea> <br>
    파일 : <input type="file" name="file"><br>
    <button type="submit">작성하기</button>
</form>