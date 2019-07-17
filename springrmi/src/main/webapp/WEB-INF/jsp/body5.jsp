<%--
  Created by IntelliJ IDEA.
  User: kxp6223065
  Date: 2019/6/22
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div style="height: 300px">

    <div style="text-align: center"><img src="/image/timg.gif"></div>
    <form action="/u/fileupload" method="post" enctype="multipart/form-data" >
        选择图片：<input type="file" name="file" /><br>
        <div>
            <input type="submit" value="文件上传">
        </div>
    </form>
    <form action="/u/filedownload" method="post">
        <input type="text" name="filename" >
        <input type="submit" value="点击下载">
    </form>
    <div>
        <a href="${path}">查看文件</a>

    </div>
</div>
