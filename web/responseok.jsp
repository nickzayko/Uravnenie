<%--
  Created by IntelliJ IDEA.
  User: Nikolay
  Date: 21.11.2017
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Результатом решения квадратного уравнения вида:</h1>
<p> ${A} * x<sup>2</sup> + ${B} * x + ${C} = 0 является:</p>
<p>дискриминант уравнения = ${D}</p>
<p> корни уравнения: ${solution} </p>

<form action="index.jsp" method="get">
    <input type="submit" value="Вернуться на начальную страницу">
</form>

</body>
</html>
