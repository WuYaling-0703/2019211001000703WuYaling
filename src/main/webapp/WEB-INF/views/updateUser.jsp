<%--
  Created by IntelliJ IDEA.
  User: 86156
  Date: 2021/4/23
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1> User Update</h1>
<%
    User u=(User) session.getAttribute("user");

%>
<div class="center">
    <form method="post" action="/2019211001000703WuYaling_war_exploded/updateUser">
        <tr> <td>Id:</td> <td><input type="text" name="Id" value="<%=u.getId()%>" required><br/></td></tr>
        <input type="hidden" name="id" value=""<%=u.getId()%>
        Username:<input type="text" name="username" value="<%=u.getUsername()%>"><br/>
        Password:<input type="password" name="password" id="password"  value="<%=u.getPassword()%>"><br/>
        Email :<input type="email" name="email" value="<%=u.getEmail()%>"><br/>
        <tr>
            <td>Gender:</td>
            <td>
                <input type="radio" name="gender" value="Male" <%= "Male".equals(u.getGender())?"checked":""%>> Male <!-- checked="checked"默认选择项 -->
                <input type="radio" name="gender" value="Female" <%= "Female".equals(u.getGender())?"checked":""%>> Female
            </td>
        </tr>
        <br/>
        Birthdate :<input type="date" name="birthdate" value=""<%=u.getBirthdate()%> /><br/>


        <tr> <td></td><td><input type="submit" value="Save Changes"/></td>  </tr>
    </form>

    <br/><br/><br/><br/>
</div>
<%@include file="footer.jsp"%>
