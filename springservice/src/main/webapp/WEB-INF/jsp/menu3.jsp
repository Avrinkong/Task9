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
<div class="col-md-3">
    <div class="four-enterprise">
        <div class="four-enterprise1">合作企业</div>
        <c:forEach items="${companyList}" var="list">
            <div class="four-enterprise2">
                <div class="four-circle1" ></div>
                <div class="four-circle2"></div>
                <a href="${pageContext.request.contextPath}/three?id=${list.id}">${list.company}</a>
            </div>
        </c:forEach>
    </div>
</div>
</body>
