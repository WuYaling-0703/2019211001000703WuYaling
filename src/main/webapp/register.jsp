<%--
  Created by IntelliJ IDEA.
  User: 86156
  Date: 2021/3/11
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="register"> <!--within doPost() in servlet-->
    Username:<input type="text" name="Username"><br/>
    Password:<input type="text" name="password"><br/>
    Email:<input type="text" name="Email"><br/>
    Gender: <input type="radio" name="Gender" value="male">Male<input type="radio" name="gender" value="female">Female<br/>
    <!--if name is same it make array -->
    Date of Birth:<input type="text name" name="BirthDate" ><br/>
    <input type="submit" value="Register"/>
</form>
</body>
</html>
