<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kxp6223065
  Date: 2019/6/20
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="jnshu.tiles.listener.myListener"%>

<body>
<div class="container">
    <div class="row one-row">
        <div class="col one-fontsize">客服热线：010-594-78634</div>
        <div class="col">
            <%--<c:if test="${pageContext.servletContext.getAttribute(num)!=null}" >

            </c:if>
            <c:if test="${pageContext.servletContext.getAttribute(num)==null}" >
                <script>
                    document.getElementById(login).style.display="none";
                </script>
            </c:if>--%>
            <div id="login" class="one-image" >
                当前页面的人数为<%=myListener.getActiveSessions() %>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span><a style="color: #333333;" href="/login">登录</a> </span>
                &nbsp;&nbsp;<span><a style="border-left: #999999 1px solid;padding-left:10px;color: #333333;" href="/u/loginOut">登出</a> </span>
                <div class="one-image1"></div>
                <div class="one-image2"></div>
                <div class="one-image3"></div>
            </div>

        </div>
    </div>
</div>
<div class="two">
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="two-tree">技能树</div>
                <div class="two-website">www.jnshu.com</div>
            </div>
            <nav class="col navbar-expand-md navbar-dark">
                <button class="two-button navbar-toggler" type="button" data-toggle="collapse" data-target="#a">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="two-ul-li collapse navbar-collapse" id="a">
                    <ul class="two-ul navbar-nav">
                        <li class="two-li nav-item">
                            <a class="two-a" href="/u/one">首页</a>
                            <div class="two-underline"></div>
                        </li>
                        <li class="two-li nav-item">
                            <a class="two-a" href="/u/two">职业</a>
                            <div class="two-underline"></div>
                        </li>
                        <li class="two-li nav-item">
                            <a class="two-a" href="/three">推荐</a>
                            <div class="two-underline"></div>
                        </li>
                        <li class="two-li nav-item">
                            <a class="two-a" href="/u/one">关于</a>
                            <div class="two-underline"></div>
                        </li>
                        <li class="two-li nav-item">
                            <a class="two-a" href="/u/five">VIP位置</a>
                            <div class="two-underline"></div>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    </div>
</div>
</body>