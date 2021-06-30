<%--
  Created by IntelliJ IDEA.
  User: chenjiang
  Date: 2021/6/6
  Time: 8:19 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.swufe.javaee.jsp.Counter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<%
    out.println(Counter.getCount());
%>
<br/>
<%= Counter.getCount() %>
</body>
</html>