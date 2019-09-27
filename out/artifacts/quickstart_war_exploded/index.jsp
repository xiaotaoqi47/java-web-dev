<%--
  Created by IntelliJ IDEA.
  User: 吴敏
  Date: 2019/9/22
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  首页
  <%=session.getAttribute("username")%>
  <%=session.getAttribute("password")%>
  <a href="login.html" target="_blank">点击返回登录页面</a>
  </body>
</html>
