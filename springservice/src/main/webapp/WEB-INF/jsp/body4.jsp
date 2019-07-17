<%--
  Created by IntelliJ IDEA.
  User: kxp6223065
  Date: 2019/6/26
  Time: 2:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body><div style="background-color: #F5F5F5;padding: 100px 0 100px 0;height: 600px;display:flex;justify-content: space-around">
    <div >
        <img src="/image/12.png">
    </div >
    <div style="background-color: #ffffff;border: 1px solid #999999;width: 400px;height: 350px;display: flex;justify-content: center">

        <form action="/login" method="post">
            <h2 style="color: #29b078;margin: 10px 10px;text-align: center">用户登陆</h2>
            <div style="margin-bottom: 20px;margin-top: 20px">
                <input style="height: 50px;width: 250px;font-size: large" type="text" name="username" placeholder="请输入用户名或手机号码或者邮箱号码">
            </div>
            <div style="margin-bottom: 20px">
                <input style="height: 50px;width: 250px;font-size: large" type="password" name="password" placeholder="请输入登陆密码">
            </div>

            <div style="margin: 10px 0 0 10px;"><strong>${msg}</strong></div>
            <div style="margin-top: 20px">
                <!--<input  type="submit" value="登陆" style="width: 120px;height: ">-->
                <button style="width: 250px;height: 50px;background-color: #29b078;color: white;font-size: large" type="submit">
                    登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;陆</button>
            </div>
            <div style="margin: 10px 10px 0 180px"><a style="font-size: small;color: #999999" href="/register">立即注册</a></div>
        </form>

    </div>
</div>
</body>
</html>
