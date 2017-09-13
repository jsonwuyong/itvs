
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>itvs</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="./css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="./js/jquery.js"></script>
    <script type="text/javascript" src="./js/jquery.min.js"></script>
    <!-- Custom Theme files -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="keywords" content="登录"/>
</head>
<body>
<!--header start here-->
<div class="login-form">
    <div class="top-login">
        <span><img src="images/group.png" alt=""/></span>
    </div>
    <h1>login</h1>
    <div class="login-top">
        <form method="post" action="./page/index" onsubmit="return loginToMain()">
            <div class="login-ic">
                <i></i>
                <input type="text" id="username" value="吴永" onFocus="this.value = '';"
                       onBlur="if (this.value == '') {this.value = 'User name';}"/>
                <div class="clear"></div>
            </div>
            <div class="login-ic">
                <i class="icon"></i>
                <input type="password" value="密码" onFocus="this.value = '';"
                       onBlur="if (this.value == '') {this.value = 'password';}"/>
                <div class="clear"></div>
            </div>

            <div class="log-bwn">
                <input type="submit" value="Login">
            </div>

        </form>
    </div>

</div>
</body>
<script type="text/javascript">
    function loginToMain(){
        if ($("#username").val() == "") {
            $("#username").focus();
            return false;
        } else {
            return true;
        }
    }
</script>
</html>