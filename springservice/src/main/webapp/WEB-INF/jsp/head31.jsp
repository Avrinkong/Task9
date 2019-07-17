<%--
  Created by IntelliJ IDEA.
  User: kxp6223065
  Date: 2019/6/20
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<div class="container">
    <div class="row one-row">
        <div class="col">
            <div class="one-phone">客服热线：010-594-78634</div>
        </div>
        <div class="col one-col-img">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span><a style="color: #333333;" href="/login">登录</a> </span>
            &nbsp;&nbsp;<span><a style="border-left: #999999 1px solid;padding-left:10px;color: #333333;" href="/u/loginOut">登出</a> </span>
            <div class="one-img1"></div>
            <div class="one-img2"></div>
            <div class="one-img3"></div>
        </div>
    </div>
</div>
<div class="two">
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="two-logo">技能树</div>
                <div class="two-website">www.jnshu.com</div>
            </div>
            <nav class="col navbar-expand-md navbar-dark two-nav">
                <button class="navbar-toggler two-button" type="button" data-toggle="collapse" data-target="#a">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse two-ul-li" id="a">
                    <ul class="navbar-nav">
                        <li class="nav-item two-li1-3">
                            <a class="two-a" href="${pageContext.request.contextPath}/u/one">首页</a>
                            <div class="two-a-undline"></div>
                        </li>
                        <li class="nav-item two-li1-3">
                            <a class="two-a" href="${pageContext.request.contextPath}/u/two">职业</a>
                            <div class="two-a-undline"></div>
                        </li>
                        <li class="nav-item two-li1-3">
                            <a class="two-a" href="${pageContext.request.contextPath}/three">推荐</a>
                            <div class="two-a-undline"></div>
                        </li>
                        <li class="nav-item two-li4">
                            <a class="two-a" href="${pageContext.request.contextPath}/u/one">关于</a>
                            <div class="two-a-undline"></div>
                        </li>
                        <li class="nav-item two-li4">
                            <a class="two-a" href="${pageContext.request.contextPath}/u/five">关于</a>
                            <div class="two-a-undline"></div>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    </div>
</div>
</body>
