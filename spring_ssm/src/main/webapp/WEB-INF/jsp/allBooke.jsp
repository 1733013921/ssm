<%--
  Created by IntelliJ IDEA.
  User: 86155
  Date: 2020/12/15
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>allBooke</title>
</head>
<body>
<c:forEach items="${bookesList}" var="b">
    <p>${b.bookName}</p>
</c:forEach>
</body>
</html>
