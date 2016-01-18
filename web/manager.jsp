<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/1/18
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin page</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/header.js"></script>

    <script type="text/javascript" src="js/login.js"></script>
</head>
<body>

<header>
    <jsp:include page="header.jsp"></jsp:include>
</header>

<div class="row">
    <div class="container">
        <table class="table table-bordered table-hover">
            <caption class="text-center">StateMachine Instances Management</caption>
            <thead>
            <tr>
                <td>ProcessID</td>
                <td>ProcessName</td>
                <td>ProcessState</td>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>123</td>
                <td>123</td>
                <td>123</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
