<%-- 
    Document   : index
    Created on : 31.01.2018, 17:38:39
    Author     : oleksandr.bilovol
--%>

<H1>You have BODY </H1>

<%@ page import="com.mycompany.mavenproject1.MyClass"%>

<jsp:useBean id="test" class="com.mycompany.mavenproject1.MyClass" />
  <%
   MyClass tc = new MyClass();
   out.print(tc.testMethod());
  %>