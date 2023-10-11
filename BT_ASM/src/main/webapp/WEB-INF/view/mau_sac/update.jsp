<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<form action="/mau-sac/update" method="post">
    <div class="mb-3">
        ID: <input type="text" name="id" readonly value="${ms1.id}">
        <br>
        Mã : <input type="text" name="ma" value="${ms1.ma}">
        <br>
        Tên: <input type="text" name="ten" value="${ms1.ten}">
        <br>
        <br>
        <button class="btn btn-success" type="submit">update</button>
    </div>
</form>
<br>
<br>

</body>
</html>