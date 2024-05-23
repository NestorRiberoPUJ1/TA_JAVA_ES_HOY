<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/css/base.css">
</head>

<body>

    <h1>Bienvenidos a la tienda de frutas</h1>

    <table>
        <thead>
            <tr>
                <th>FRUTA</th>
                <th>PRECIO</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="fruta" items="${fruits}">
                <tr>
                    <td>${fruta.getName()}</td>
                    <td>${fruta.price}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>

</html>