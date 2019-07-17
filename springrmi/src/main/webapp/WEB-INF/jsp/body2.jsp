<%--
  Created by IntelliJ IDEA.
  User: kxp6223065
  Date: 2019/6/20
  Time: 1:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>|
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<div class="container">
    <div class="row">
        <div class="col three-col">
            首页><div class="three-font-green">职业</div>
        </div>
    </div>
    <div class="row">
        <div class="col three-col2">
            <div class="three-font-direction">方向:</div>
            <a href="#" class="three-font-all">&ensp;全部&ensp;</a>
            <a href="#aa" class="three-font-all">&ensp;前端开发&ensp;</a>
            <a href="#bb" class="three-font-all">&ensp;后端开发&ensp;</a>
            <a href="#cc" class="three-font-all">&ensp;移动开发&ensp;</a>
            <!-- <a href="#dd" class="three-font-all">&ensp;整站开发&ensp;</a> -->
            <a href="#dd" class="three-font-all">&ensp;运营维护&ensp;</a>
        </div>
    </div>
</div>
<div class="five">
    <div class="container">
        <div class="row">
            <div id="aa" class="col five-title">前端开发方向</div>
        </div>
        <div class="row">
            <c:forEach items="${flist}" var="list">
                <div class="col-md-6 col-lg-4">
                    <div class="table-black">
                        <div class="table-hover1">
                            <div class="table-hover1-1">${list.profession}</div>
                            <div class="table-hover1-2">${list.introduction}</div>
                        </div>
                        <table>
                            <tr>
                                <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                            </tr>
                            <tr>
                                <td colspan="4" rowspan="2">
                                    <div style=" margin: 10px auto;width: 100px;height: 100px;background: url(${list.img}) 0 0/100px 100px no-repeat;"></div>
                                </td>
                                <td colspan="6" class="border1">${list.profession}</td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border1-1">
                                        ${list.description}</td>
                            </tr>
                            <tr>
                                <td colspan="5" class="border2">&ensp;门槛
                                    <c:forEach var="a" begin="1" end="${list.threshold}" >
                                    <div class="table-image2"></div>
                                    </c:forEach>
                                </td>
                                <td colspan="5" class="border2">&ensp;难易程度
                                    <c:forEach var="a" begin="1" end="${list.difficulty}" >
                                        <div class="table-image2"></div>
                                    </c:forEach>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="5" class="border2">&ensp;成长周期&ensp;<span
                                        class="border2-font-red">${list.growth}</span><span class="border2-font-blank">年</span>
                                </td>
                                <td colspan="5" class="border2">&ensp;稀缺程度&ensp;<span
                                        class="border2-font-red">${list.scarcity}</span><span class="border2-font-blank">家公司需要</span>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="4" rowspan="3" class="border3-1">薪资待遇</td>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">0-1年</div>
                                        <div class="border3-2-conter">${list.yearone}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">1-3年</div>
                                        <div class="border3-2-conter">${list.yeartwo}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">3-5年</div>
                                        <div class="border3-2-conter">${list.yearthree}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="10" class="border4">&ensp;有<span class="border4-font-red">${list.learnpeople}</span>人正在学
                                </td>
                            </tr>
                            <tr>
                                <td colspan="10" class="border5">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="row">
            <div id="bb" class="col five-title">后端开发方向</div>
        </div>
        <div class="row">
            <c:forEach items="${blist}" var="list">
                <div class="col-md-6 col-lg-4">
                    <div class="table-black">
                        <div class="table-hover1">
                            <div class="table-hover1-1">${list.profession}</div>
                            <div class="table-hover1-2">${list.introduction}</div>
                        </div>
                        <table>
                            <tr>
                                <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                            </tr>
                            <tr>
                                <td colspan="4" rowspan="2">
                                    <div style=" margin: 10px auto;width: 100px;height: 100px;background: url(${list.img}) 0 0/100px 100px no-repeat;"></div>
                                </td>
                                <td colspan="6" class="border1">${list.profession}</td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border1-1">
                                        ${list.description}</td>
                            </tr>
                            <tr>
                                <td colspan="5" class="border2">&ensp;门槛
                                    <c:forEach var="a" begin="1" end="${list.threshold}" >
                                        <div class="table-image2"></div>
                                    </c:forEach>
                                </td>
                                <td colspan="5" class="border2">&ensp;难易程度
                                    <c:forEach var="a" begin="1" end="${list.difficulty}" >
                                        <div class="table-image2"></div>
                                    </c:forEach>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="5" class="border2">&ensp;成长周期&ensp;<span
                                        class="border2-font-red">${list.growth}</span><span class="border2-font-blank">年</span>
                                </td>
                                <td colspan="5" class="border2">&ensp;稀缺程度&ensp;<span
                                        class="border2-font-red">${list.scarcity}</span><span class="border2-font-blank">家公司需要</span>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="4" rowspan="3" class="border3-1">薪资待遇</td>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">0-1年</div>
                                        <div class="border3-2-conter">${list.yearone}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">1-3年</div>
                                        <div class="border3-2-conter">${list.yeartwo}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">3-5年</div>
                                        <div class="border3-2-conter">${list.yearthree}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="10" class="border4">&ensp;有<span class="border4-font-red">${list.learnpeople}</span>人正在学
                                </td>
                            </tr>
                            <tr>
                                <td colspan="10" class="border5">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="row">
            <div id="cc" class="col five-title">移动开发</div>
        </div>
        <div class="row">
            <c:forEach items="${mlist}" var="list">
                <div class="col-md-6 col-lg-4">
                    <div class="table-black">
                        <div class="table-hover1">
                            <div class="table-hover1-1">${list.profession}</div>
                            <div class="table-hover1-2">${list.introduction}</div>
                        </div>
                        <table>
                            <tr>
                                <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                            </tr>
                            <tr>
                                <td colspan="4" rowspan="2">
                                    <div style=" margin: 10px auto;width: 100px;height: 100px;background: url(${list.img}) 0 0/100px 100px no-repeat;"></div>
                                </td>
                                <td colspan="6" class="border1">${list.profession}</td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border1-1">
                                        ${list.description}</td>
                            </tr>
                            <tr>
                                <td colspan="5" class="border2">&ensp;门槛
                                    <c:forEach var="a" begin="1" end="${list.threshold}" >
                                        <div class="table-image2"></div>
                                    </c:forEach>
                                </td>
                                <td colspan="5" class="border2">&ensp;难易程度
                                    <c:forEach var="a" begin="1" end="${list.difficulty}" >
                                        <div class="table-image2"></div>
                                    </c:forEach>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="5" class="border2">&ensp;成长周期&ensp;<span
                                        class="border2-font-red">${list.growth}</span><span class="border2-font-blank">年</span>
                                </td>
                                <td colspan="5" class="border2">&ensp;稀缺程度&ensp;<span
                                        class="border2-font-red">${list.scarcity}</span><span class="border2-font-blank">家公司需要</span>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="4" rowspan="3" class="border3-1">薪资待遇</td>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">0-1年</div>
                                        <div class="border3-2-conter">${list.yearone}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">1-3年</div>
                                        <div class="border3-2-conter">${list.yeartwo}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">3-5年</div>
                                        <div class="border3-2-conter">${list.yearthree}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="10" class="border4">&ensp;有<span class="border4-font-red">${list.learnpeople}</span>人正在学
                                </td>
                            </tr>
                            <tr>
                                <td colspan="10" class="border5">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="row">
            <div id="dd" class="col five-title">运维方向</div>
        </div>
        <div class="row">
            <c:forEach items="${klist}" var="list">
                <div class="col-md-6 col-lg-4">
                    <div class="table-black">
                        <div class="table-hover1">
                            <div class="table-hover1-1">${list.profession}</div>
                            <div class="table-hover1-2">${list.introduction}</div>
                        </div>
                        <table>
                            <tr>
                                <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
                            </tr>
                            <tr>
                                <td colspan="4" rowspan="2">
                                    <div style=" margin: 10px auto;width: 100px;height: 100px;background: url(${list.img}) 0 0/100px 100px no-repeat;"></div>
                                </td>
                                <td colspan="6" class="border1">${list.profession}</td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border1-1">
                                        ${list.description}</td>
                            </tr>
                            <tr>
                                <td colspan="5" class="border2">&ensp;门槛
                                    <c:forEach var="a" begin="1" end="${list.threshold}" >
                                        <div class="table-image2"></div>
                                    </c:forEach>
                                </td>
                                <td colspan="5" class="border2">&ensp;难易程度
                                    <c:forEach var="a" begin="1" end="${list.difficulty}" >
                                        <div class="table-image2"></div>
                                    </c:forEach>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="5" class="border2">&ensp;成长周期&ensp;<span
                                        class="border2-font-red">${list.growth}</span><span class="border2-font-blank">年</span>
                                </td>
                                <td colspan="5" class="border2">&ensp;稀缺程度&ensp;<span
                                        class="border2-font-red">${list.scarcity}</span><span class="border2-font-blank">家公司需要</span>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="4" rowspan="3" class="border3-1">薪资待遇</td>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">0-1年</div>
                                        <div class="border3-2-conter">${list.yearone}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">1-3年</div>
                                        <div class="border3-2-conter">${list.yeartwo}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="6" class="border3-2">
                                    <div class="border3-2-flex">
                                        <div class="border3-2-conter">3-5年</div>
                                        <div class="border3-2-conter">${list.yearthree}/月</div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="10" class="border4">&ensp;有<span class="border4-font-red">${list.learnpeople}</span>人正在学
                                </td>
                            </tr>
                            <tr>
                                <td colspan="10" class="border5">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
</body>