<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
登录成功！<%=session.getAttribute("username")%><a href="${pageContext.request.contextPath}/user/logout">退出</a>
</body>
</html>