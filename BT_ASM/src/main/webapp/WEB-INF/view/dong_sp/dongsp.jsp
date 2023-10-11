<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<form action="/dong-sp/add" method="post">
    <div class="mb-3">
        ID: <input type="text" name="id" readonly value="${dsp1.id}">
        <br>
        Mã : <input type="text" name="ma" value="${dsp1.ma}">
        <br>
        Tên: <input type="text" name="ten" value="${dsp1.ten}">
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
        <c:forEach items="${listDSP}" var="dsp" varStatus="i">
            <tr>
                <td>${i.index}</td>
                <td>${dsp.id}</td>
                <td>${dsp.ma}</td>
                <td>${dsp.ten}</td>
                <td>
                    <a href="/dong-sp/detail/${dsp.id}">Detail</a>
                    <a href="/dong-sp/remove/${dsp.id}">Remove</a>
                    <a href="/dong-sp/view-update/${dsp.id}">Update</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
</body>
</html>