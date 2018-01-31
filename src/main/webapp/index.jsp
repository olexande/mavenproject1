<%-- 
    Document   : newjsp
    Created on : 31.01.2018, 15:28:24
    Author     : oleksandr.bilovol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@ include file="up.jsp" %> 
        <h1>Hello World!</h1>
        <%@ include file="body.jsp" %> 
                <%
    double num = Math.random();
    if (num > 0.95) {
  %>
      <h2>You'll have a luck day!</h2><p>(<%= num %>)</p>
  <%
    } else {
  %>
      <h2>Well, life goes on ... </h2><p>(<%= num %>)</p>
  <%
    }
  %>
  <%@ include file="file.jsp" %> 
  <%@ include file="down.jsp" %> 
    </body>
</html>
