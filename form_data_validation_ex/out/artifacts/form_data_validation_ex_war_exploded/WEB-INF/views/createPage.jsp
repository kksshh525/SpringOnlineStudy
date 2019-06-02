<%--
  Created by IntelliJ IDEA.
  User: suhyeonkim
  Date: 2019-06-02
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>createPage</title>
</head>
<body>
createPage.jsp

<form action="student/create">
    name: <input type="text" name="name" value="${student.name}"><br/>
    id: <input type="text" name="id" value="${student.id}"><br/>
    <input type="submit" value="send"> <br/>
</form>
</body>
</html>
