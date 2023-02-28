<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: днс
  Date: 28.02.2023
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Employee room</h1>
<br>
<br>
<security:authorize access="hasAnyRole('IT', 'SECURITY', 'DIRECTOR')">
<input type="button" value="For IT"
       onclick="window.location.href='It_info'">
For IT
</security:authorize>
<br>
<br>
<security:authorize access="hasAnyRole('SECURITY', 'DIRECTOR')">
<input type="button" value="For Security"
       onclick="window.location.href='Security_info'">
For Security
</security:authorize>
<br>
<br>
<security:authorize access="hasAnyRole('DIRECTOR')">
<input type="button" value="For Director"
       onclick="window.location.href='Director_info'">
For Director only!
</security:authorize>
<br>
<br>

</body>
</html>
