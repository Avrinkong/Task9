<%--
  Created by IntelliJ IDEA.
  User: kxp6223065
  Date: 2019/6/20
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <tiles:insertAttribute name="head"/>
</head>
<body>
<tiles:insertAttribute name="header"/>
<tiles:insertAttribute name="head1"/>
    <div class="container">
        <div class="row">
            <div class="col four-homepage">首页><span class="four-homepage2">合作企业</span></div>
        </div>
        <div class="row">
            <tiles:insertAttribute name="menu"/>
            <tiles:insertAttribute name="body"/>
        </div>
    </div>
<tiles:insertAttribute name="footer"/>
</body>
</html>
