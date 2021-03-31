<%--
  Created by IntelliJ IDEA.
  User: 86156
  Date: 2021/3/11
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
<form>
    <sapn style="">This is my register JSP page</sapn><br/><br/>
    <sapn style="">Username</sapn> <input type="text" name="name" required="true" style=""><br/><br/>
    <sapn style="">Password</sapn> <input type="password" name="password" required="true" style=""><br/><br/>
    <sapn style="">Email</sapn> <input type="email" name="email" required="true" style=""><br/><br/>
    <sapn style="">Gender</sapn>
    <sapn style="">Male</sapn> <input type="radio">
    <sapn style="">Female</sapn> <input type="radio"><br/><br/>
    <sapn style="">Date of birth(yyyy-mm-dd)</sapn> <input type="date" pattern="yyyy-mm-dd" required="true" style=""><br/><br/>
    <input type="submit" value="register" style="...">
</form>
<!--
<form method="post" action="register"> <!within doPost() in servlet
    Username:<input type="text" name="Username"><br/>
    Password:<input type="text" name="password"><br/>
    Email:<input type="text" name="Email"><br/>
    Gender: <input type="radio" name="Gender" value="male">Male<input type="radio" name="gender" value="female">Female<br/>
    <--if name is same it make array ->
    Date of Birth:<input type="text name" name="BirthDate" ><br/>
    <input type="submit" value="Register"/>
</form>-->
<%@include file="footer.jsp"%>
