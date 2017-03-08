<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
 
<!DOCTYPE HTML>
<html>
<head>
<title>jsp demo</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/demo.css' />"/>  
</head>
 
<body>
<h1>用户列表</h1>
<table border="1">
<tr>
<td>编号</td>
<td>姓名</td>
<td>工资</td>
</tr>
<c:forEach items="${users}" var="user">
<tr>
<td>${user.id}</td>
<td>${user.name}</td>
<td>${user.age}</td>
</tr>
</c:forEach>
</table>
</body>
</html>