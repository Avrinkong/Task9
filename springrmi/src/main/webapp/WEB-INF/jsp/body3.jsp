<%--
  Created by IntelliJ IDEA.
  User: kxp6223065
  Date: 2019/6/20
  Time: 1:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<div class="col-md-9">
    <div class="four-tudou">
        <div class="four-tudou-font1">
            <div style="float: left; margin: 15px 10px 0 26px;width: 100px;height: 50px;
    background: url(${company.image}) 0 -20px/ 100px 110px;"></div>
            <div class="four-tudou-font1-1">${company.introduction}</div>
        </div>
        <div class="four-tudou-font2">${company.history}</div>
    </div>
</div>
</body>
