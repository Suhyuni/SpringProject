<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>책 정보 입력</title>
    <h1>책 정보 입력</h1>
    <form action="/book/save" method="post">
        <input type="text" name="title" id="title" placeholder="책 제목">
        <input type="text" name="author" id="author" placeholder="저자">
        <input type="text" name="publisher" id="publisher" placeholder="출판사">
        <input type="text" name="publication_year" id="publication_year" placeholder="출판년도">
        <input type="text" name="bookImage" id="bookImage" placeholder="사진 URL">
        <input type="submit" value="책 정보 입력하기">

    </form>
</head>
<body>

</body>
</html>
