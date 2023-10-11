<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<form action="/n-sx/add" method="post">
    <div class="mb-3">
        ID: <input type="text" name="id" readonly value="${nsx1.id}">
        <br>
        Mã : <input type="text" name="ma" value="${nsx1.ma}">
        <br>
        Tên: <input type="text" name="ten" value="${nsx1.ten}">
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
        <c:forEach items="${listNSX}" var="nsx" varStatus="i">
            <tr>
                <td>${i.index}</td>
                <td>${nsx.id}</td>
                <td>${nsx.ma}</td>
                <td>${nsx.ten}</td>
                <td>
                    <a href="/n-sx/detail/${nsx.id}">Detail</a>
                    <a href="/n-sx/remove/${nsx.id}">Remove</a>
                    <a href="/n-sx/view-update/${nsx.id}">Update</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
</body>
</html>