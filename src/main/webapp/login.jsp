<%--
  Created by IntelliJ IDEA.
  User: 86156
  Date: 2021/3/30
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="header.jsp"%>
<h1>Login</h1>
<form method="post" action="/2019211001000703WuYaling_war_exploded/login">
    <table>
        <tr> <td>username:</td> <td><input type="text" name="username" required><br/></td></tr>
        <tr> <td>password:</td> <td><input type="password" name="password" required minlength="8"><br/></td></tr>
        <tr> <td></td><td><input type="submit" value="Login"/></td>  </tr>
    </table>
</form>
<%@include file="footer.jsp"%>
