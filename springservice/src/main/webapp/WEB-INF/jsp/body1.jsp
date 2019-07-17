
<%--
  Created by IntelliJ IDEA.
  User: kxp6223065
  Date: 2019/6/19
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="three" class="carousel slide" data-ride="carousel">
    <ul class="carousel-indicators">
        <li data-target="#three" data-slide-to="0" class="active"></li>
        <li data-target="#three" data-slide-to="1"></li>
        <li data-target="#three" data-slide-to="2"></li>
    </ul>
    <div style="margin-bottom: 116px;" class="carousel-inner">
        <div class="carousel-item active">
            <img src="../image/1/three1.png">
        </div>
        <div class="carousel-item">
            <img src="../image/1/three2.png">
        </div>
        <div class="carousel-item">
            <img src="../image/1/three3.png">
        </div>
    </div>
    <a class="carousel-control-prev" href="#three" data-slide="prev">
        <span class="carousel-control-prev-icon"></span>
    </a>
    <a class="carousel-control-next" href="#three" data-slide="next">
        <span class="carousel-control-next-icon"></span>
    </a>
</div>
<div class="container">
    <div class="row">
        <div class="col-12 col-sm-6 col-md-3 four-img">
            <div class="four-img1"></div>
            <div class="four-font1-3">高效</div>
            <div class="four-font2-3">将五到七年的成长时间，缩短到一年到三年。</div>
        </div>
        <div class="col-12 col-sm-6 col-md-3 four-img">
            <div class="four-img2"></div>
            <div class="four-font1-3">规范</div>
            <div class="four-font2-3">标准的实战教程，不会走弯路</div>
        </div>
        <div class="col-12 col-sm-6 col-md-3 four-img">
            <div class="four-img3"></div>
            <div class="four-font1-3">人脉</div>
            <div class="four-font2-3">同班好友，同院学长，技术大师，入学就混入职脉圈</div>
        </div>
        <div class="col-12 col-sm-6 col-md-3 four-img four-col4">
            <div class="four-img4-1">
                <div class="four-font1">12400</div>
                <div class="four-font2">累计在线学习人数</div>
            </div>
            <div class="four-img4-2">
                <div class="four-font1">12400</div>
                <div class="four-font2">学员已经找到满意工作</div>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col five-study">如何学习</div>
    </div>
    <div class="row">
        <div class="col-sm-12 col-md-6 col-lg-3 five-col">
            <div class="five-circle">1</div>
            <div class="five-font">匹配你现在的个人情况寻找适合自己的岗位</div>
            <div class="five-triangle five-triangle2"></div>
        </div>
        <div class="col-sm-12 col-md-6 col-lg-3 five-col">
            <div class="five-circle">2</div>
            <div class="five-font">了解职业前景薪金待遇、竞争压力等</div>
            <div class="five-triangle"></div>
        </div>
        <div class="col-sm-12 col-md-6 col-lg-3 five-col">
            <div class="five-circle">3</div>
            <div class="five-font">掌握行业内顶级技能</div>
            <div class="five-triangle five-triangle2"></div>
        </div>
        <div class="col-sm-12 col-md-6 col-lg-3 five-col">
            <div class="five-circle">4</div>
            <div class="five-font">查看职业目标任务</div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-12 col-md-6 col-lg-3 five-col">
            <div class="five-circle">5</div>
            <div class="five-font">参考学习资源，掌握技能点，逐个完成任务</div>
            <div class="five-triangle five-triangle2"></div>
        </div>
        <div class="col-sm-12 col-md-6 col-lg-3 five-col">
            <div class="five-circle">6</div>
            <div class="five-font">加入班级，和小伙伴们互帮互助，一块学习</div>
            <div class="five-triangle"></div>
        </div>
        <div class="col-sm-12 col-md-6 col-lg-3 five-col">
            <div class="five-circle">7</div>
            <div class="five-font">选择导师，一路引导，加速自己成长</div>
            <div class="five-triangle five-triangle2"></div>
        </div>
        <div class="col-sm-12 col-md-6 col-lg-3 five-col">
            <div class="five-circle">8</div>
            <div class="five-font">完成职业技能，升级业界大牛</div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col six-student">优秀学员展示</div>
    </div>
    <div class="row">
        <c:forEach items="${list}" var="list1">
            <div class="col-sm-12 col-md-6 col-lg-3">
                <div class="six-img">
                    <div style=" margin: 20px auto 36px; width: 108px;height: 108px; background: url(${list1.img}) 0 0/108px 108px;"></div>
                    <div class="six-font1-4">${list1.position}：${list1.name}</div>
                    <div class="six-font2-4">${list1.position}:${list1.description}</div>
                </div>
            </div>
        </c:forEach>

        <%--<div class="col-sm-12 col-md-6 col-lg-3">
            <div class="six-img">
                <div class="six-img2"></div>
                <div class="six-font1-4">技术顾问：郭富城</div>
                <div class="six-font2-4">百度技术总监：互联网基础服务领域，从事虚拟主机、云服务器、域名。曾任新网高级技术经理，负责技术研发、团队管理与建设。</div>
            </div>
        </div>
        <div class="col-sm-12 col-md-6 col-lg-3">
            <div class="six-img">
                <div class="six-img3"></div>
                <div class="six-font1-4">技术顾问：张学友</div>
                <div class="six-font2-4">百度技术总监：互联网基础服务领域，从事虚拟主机、云服务器、域名。曾任新网高级技术经理，负责技术研发、团队管理与建设。</div>
            </div>
        </div>
        <div class="col-sm-12 col-md-6 col-lg-3">
            <div class="six-img">
                <div class="six-img4"></div>
                <div class="six-font1-4">技术顾问：黎明</div>
                <div class="six-font2-4">百度技术总监：互联网基础服务领域，从事虚拟主机、云服务器、域名。曾任新网高级技术经理，负责技术研发、团队管理与建设。</div>
            </div>
        </div>--%>
    </div>
    <div class="row">
        <div class="col six-col-bottom">
            <div class="six-bottom"></div>
            <div class="six-bottom"></div>
            <div class="six-bottom"></div>
            <div class="six-bottom"></div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col seven-enterprise">战略合作企业</div>
    </div>
    <div class="row" style="margin-bottom: 330px;">
        <div class="col-md-12 col-lg">
            <div class="seven-img-bg1 seven-col">
                <div class="seven-img1"></div>
            </div>
        </div>
        <div class="col-md-12 col-lg">
            <div class="seven-img-bg2-4 seven-col">
                <div class="seven-img2"></div>
            </div>
        </div>
        <div class="col-md-12 col-lg">
            <div class="seven-img-bg2-4 seven-col">
                <div class="seven-img3"></div>
            </div>
        </div>
        <div class="col-md-12 col-lg">
            <div class="seven-img-bg2-4 seven-col">
                <div class="seven-img4"></div>
            </div>
        </div>
        <div class="col-md-12 col-lg">
            <div class="seven-img-bg5 seven-col">
                <div class="seven-img5"></div>
            </div>
        </div>
    </div>
</div>
<div class="eight"      >
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="eight-link">友情链接</div>
            </div>
        </div>
        <div class="row">
            <div class="col-6 col-sm-6 col-md col-lg eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">手机软件<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">教师招聘<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">找工作<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">教师招聘<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">找工作<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">手机软件<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">教师招聘<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">手机软件<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">手机软件<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">找工作<div class="eight-a2-line"></div></a>
            </div>
        </div>
        <div class="row">
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">手机软件<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">教师招聘<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">找工作<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">教师招聘<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">找工作<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">手机软件<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">教师招聘<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">手机软件<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">手机软件<div class="eight-a2-line"></div></a>
            </div>
            <div class="col-6 col-sm-6 col-md eight-col">
                <div class="eight-a1"></div>
                <a class="eight-a2" href="#">找工作<div class="eight-a2-line"></div></a>
            </div>
        </div>
    </div>
</div>
