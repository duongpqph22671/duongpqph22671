<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<form action="/san-pham/add" method="post">
    <div class="mb-3">
        ID: <input type="text" name="id" readonly value="${sp1.id}">
        <br>
        Mã : <input type="text" name="ma" value="${sp1.ma}">
        <br>
        Tên: <input type="text" name="ten" value="${sp1.ten}">
        <br>
        <br>
        <button class="btn btn-success" type="submit">Add</button>
    </div>
</form>
<br>
<br>
<form>
    <table class="table table-hover">
        <tr>
            <th>#</th>
            <th>ID</th>
            <th>Mã</th>
            <th>Tên</th>

            <th colspan="2">Action</th>
        </tr>
        <tbody>
        <c:forEach items="${listSP}" var="sp" varStatus="i">
            <tr>
                <td>${i.index}</td>
                <td>${sp.id}</td>
                <td>${sp.ma}</td>
                <td>${sp.ten}</td>
                <td>
                    <a href="/san-pham/detail/${sp.id}">Detail</a>
                    <a href="/san-pham/remove/${sp.id}">Remove</a>
                    <a href="/san-pham/view-update/${sp.id}">Update</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
</body>
</html>