package jnshu.tiles;

import io.jsonwebtoken.Claims;
import jnshu.tiles.entity.User;
import jnshu.tiles.entity.UserExample;
import jnshu.tiles.service.UserService;
import jnshu.tiles.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


//实现Spring拦截器接口 HandlerInterceptor

public class LoginInterceptor implements HandlerInterceptor {

    //该注解使Spring自动为bean设置get与set。
    @Autowired
     JWTUtil jwtUtil;
    @Autowired
    UserService userService;

    //JWT工具类
    //第一个函数preHandle是预处理函数,比如我们用于拦截登录时,它是第一个工作的。
     public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
    //System.out.println("进入preHandle方法");
    //String headerToken=httpServletRequest.getHeader("token");
         //获取我们请求头中的token验证字符
    //String tokenStr=httpServletRequest.getParameter("token");
    //getParameter的变量是放在我们请求附带的对象中的字符串,例如post方法中附带的account变量等。
        /* if(!httpServletRequest.getRequestURI().contains("login")){
             //检测当前页面,我们设置当页面不是登录页面时对其进行拦截
             // 具体方法就是检测URL中有没有login字符串
             if(headerToken==null && tokenStr==null){
                 httpServletResponse.sendRedirect("login");
                 //如果token不存在的话,我们将页面重定向到login.do,也就是登录页面去。
                 return false;
                 //当返回值是false的时候,表示拦截器不会进行处理了,我们调用response来进行响应。
                 }
                 if(tokenStr!=null){
                     headerToken=tokenStr;
                     //进行token同步,后面我们会对token做验证与更新
                     }
                     try {
                         headerToken=jwtUtil.updateToken(headerToken);
                    	//对token进行更新与验证
                   }catch(Exception e) {
                         httpServletResponse.sendRedirect("login");
                         //当token验证出现异常返回到登录页面
                         return false;
                     }
                     System.out.println("real token:=="+headerToken);
                     System.out.println("real Cookie:=="+httpServletRequest.getHeader("Cookie"));
         }
         httpServletResponse.setHeader("token",headerToken);*/
         //将token加入返回页面的header
         /*return true;*/
         //当返回true表示第一个阶段结束,随后会执行postHandle和afterCompletion

         Cookie[] cookies = httpServletRequest.getCookies();
         if (cookies.length>0) {
             for (Cookie c : cookies) {
                 if (c.getName().contains("token")) {
                     Claims claims = JWTUtil.verifyToken(c.getValue());
                     if (claims.isEmpty()) {
                         httpServletResponse.sendRedirect("/login");
                         return false;
                     }
                     Long id = Long.valueOf(claims.getId());
                     String username = claims.getIssuer();
                     String password = claims.getSubject();
                     UserExample userExample = new UserExample();
                     UserExample.Criteria criteria = userExample.createCriteria();
                     criteria.andIdEqualTo(id);
                     criteria.andUsernameEqualTo(username);
                     criteria.andPasswordEqualTo(password);
                     List<User> user = userService.findUser(userExample);
                     if (null == user) {
                         httpServletResponse.sendRedirect("/login");
                         return false;
                     } else {
                         String token = jwtUtil.updateToken(c.getValue());
                         c.setValue(token);
                         return true;
                     }
                 }
             }
             httpServletResponse.sendRedirect("/login");

             return false;
         }else {
             httpServletResponse.sendRedirect("/login");
             return false;
         }
         }
         //当请求到达Controller但是未渲染View时进行处理
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
     }

     //相当于最后的回调函数
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
     }
}
