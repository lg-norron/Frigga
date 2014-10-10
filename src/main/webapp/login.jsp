<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp" %>
<!doctype html>
<html class="bg-black">
<head>
<meta charset="utf-8">
<title>渠道推广统计后台--登录</title>
<%@ include file="/common/jslibs.jsp" %>
</head>
    <body class="bg-black">

        <div class="form-box" id="login-box">
            <div class="header">Sign In</div>
            <form action="${ctx}/user/login.do" method="post">
                <div class="body bg-gray">
                    <div class="form-group">
                        <input type="text" name="username" class="form-control" placeholder="输入登录名"/>
                    </div>
                    <div class="form-group">
                        <input type="password" name="password" class="form-control" placeholder="输入密码"/>
                    </div>          
<!--                     <div class="form-group"> -->
<!--                         <input type="checkbox" name="remember_me"/> Remember me -->
<!--                     </div> -->
                </div>
                <div class="footer">                                                               
                    <button type="submit" class="btn bg-olive btn-block">登录</button>  

                </div>
            </form>
        </div>
    </body>
</html>