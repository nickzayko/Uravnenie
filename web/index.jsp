<%--
  Created by IntelliJ IDEA.
  User: Nikolay
  Date: 21.11.2017
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Введите исходные данные в окна</h1>
  <p> Помните,квадратное уравнение, это уравнение вида а*x^2 + b * x + c = 0</p>
  <form action="/solution" method="get">
    <input type="text" name="paramA">
    <p>x<sup>2</sup> + <p/>
    <input type="text" name="paramB">
    <pre>x + </pre>
    <input type="text" name="paramC">
    <p> = 0 </p>
    <input type="submit" value="ok">
  </form>
  </body>
</html>
