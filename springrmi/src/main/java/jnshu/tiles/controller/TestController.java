package jnshu.tiles.controller;


import jnshu.tiles.entity.*;
import jnshu.tiles.utils.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class TestController {

    public static Log log = LogFactory.getLog(TestController.class);

    @Autowired
    ApplicationContext ac;
/*
    @Autowired
    private MemCachedClient memCachedClient;
*/
    @Autowired
    RedisUtil redisUtil;

    @Autowired
    private Demo demo;
    @Autowired
    private VcodeUtil vcodeUtil;

    @Autowired
    private ServiceSelect serviceSelect;

    @Autowired
    private SendCommonPostMail sendCommonPostMail;

    @Autowired
    private CodeNumber codeNumber;

    @Autowired
    private FileuploadUtil fileuploadUtil;

/*    @Test
    @RequestMapping("/aop")
    public void testAop() {
        ApplicationContext ac =new ClassPathXmlApplicationContext("classpath:/spring/spring-mybatis.xml");
        TestController testController = (TestController) ac.getBean("testController");
        System.out.println("方法one 执行");
        testController.one();
        System.out.println("方法two 执行");
        testController.two();
        System.out.println("方法three 执行");
        testController.three(1L);
        System.out.println("方法five 执行");
        testController.five();
        System.out.println("方法test 执行");
        testController.test();
        *//*return "myView4";*//*

    }*/

    @RequestMapping("/u/one")
    public ModelAndView one() {
       // StudentServiceImpl studentService = (StudentServiceImpl) ac.getBean("StudentService");
        /*ApplicationContext ac =new ClassPathXmlApplicationContext("classpath:/spring/spring-mybatis.xml");
        TestController testController = (TestController) ac.getBean("companyServiceImpl");*/
        MemCachedUtil instance = MemCachedUtil.getInstance();
        StudentExample studentExample =new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        List<Student> students =null;
        if (null!=instance.get("student")){
            students= (List<Student>) instance.get("student");
        }else {
            students= serviceSelect.getStudentService().selectAll(studentExample);
        }
        List<Student> list = new ArrayList<Student>();
        if (students.size()>4){
            list = students.subList(0, 4);
        }else {
            list= students;
        }
        ModelAndView model = new ModelAndView("myView1");
        /*MemCachedUtil.getInstance().add("list",list);*/
        model.addObject("list",list);
       // model.setViewName("myView1");
        //model.addAttribute("head","head1");
       // model.addAttribute("body","body1");
        //model.addAttribute("foot","foot1");
        return model; //这里的myView为layout.xml中配置的视图名称，根据返回值，去匹配对应的jsp页面
    }

    @RequestMapping("/u/two")
    public ModelAndView two() {
        ProfessionExample professionExample = new ProfessionExample();
        ProfessionExample.Criteria criteria = professionExample.createCriteria();
        criteria.andDirectionEqualTo("前端开发方向");
        List<Profession> flist =serviceSelect.getProfessionService().select(professionExample);
        professionExample.clear();
        ProfessionExample.Criteria criteria1 = professionExample.createCriteria();
        criteria1.andDirectionEqualTo("后端开发方向");
        List<Profession> blist = serviceSelect.getProfessionService().select(professionExample);
        professionExample.clear();
        ProfessionExample.Criteria criteria2 = professionExample.createCriteria();
        criteria2.andDirectionEqualTo("移动方向");
        List<Profession> mlist = serviceSelect.getProfessionService().select(professionExample);
        ModelAndView modelAndView = new ModelAndView("myView2");
        professionExample.clear();
        ProfessionExample.Criteria criteria3 = professionExample.createCriteria();
        criteria3.andDirectionEqualTo("运维方向");
        List<Profession> klist = serviceSelect.getProfessionService().select(professionExample);
        modelAndView.addObject("flist",flist);
        modelAndView.addObject("blist",blist);
        modelAndView.addObject("mlist",mlist);
        modelAndView.addObject("klist",klist);
        System.out.println(flist);
        return modelAndView; //这里的myView为layout.xml中配置的视图名称，根据返回值，去匹配对应的jsp页面
    }

    @RequestMapping("/three")
    public ModelAndView three(@RequestParam(defaultValue = "1") Long id) {
        CompanyExample companyExample = new CompanyExample();
        CompanyExample.Criteria criteria = companyExample.createCriteria();
        criteria.andIdEqualTo(id);
        Company company =serviceSelect.getCompanyService().selectById(id);
        companyExample.clear();
        List<Company> companyList = serviceSelect.getCompanyService().selectAll(companyExample);
        // model.addAttribute("head","head1");
       // model.addAttribute("body","bod3");
       // model.addAttribute("foot","foot1");
        ModelAndView modelAndView = new ModelAndView("myView3");
        modelAndView.addObject("company",company);
        modelAndView.addObject("companyList",companyList);
        return modelAndView; //这里的myView为layout.xml中配置的视图名称，根据返回值，去匹配对应的jsp页面
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("myView4");
        return modelAndView;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView four(String username, String password, HttpServletRequest request, HttpServletResponse response) throws IOException {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if (username.matches("^(?:\\+?86)?1(?:3\\d{3}|5[^4\\D]\\d{2}|8\\d{3}|7(?:[01356789]\\d{2}|4(?:0\\d|1[0-2]|9\\d))|9[189]\\d{2}|6[567]\\d{2}|4[579]\\d{2})\\d{6}$")){
            //正则匹配手机号
            criteria.andMobileEqualTo(Long.parseLong(username));
        }else
        if (username.matches("^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$")){
            //正则匹配邮箱号
            criteria.andMailboxEqualTo(username);
        }else {
            criteria.andUsernameEqualTo(username);
        }
        password= MD5.getMd5(password);
        criteria.andPasswordEqualTo(password);
       /* HttpSession session = request.getSession();
        session.setMaxInactiveInterval(60*30);
        Object number = session.getAttribute("number");
        if (null==number){
            session.setAttribute("number",1);
        }else {
            Object num = session.getAttribute("number");
            int num1 = (int) num;
            session.setAttribute("num",num1+1);
        }*/
        List<User> list =serviceSelect.getUserService().findUser(userExample);
        if (list.size()>0){
            User user = list.get(0);
           /* user.getUsername();
            user.getPassword();*/
            String token = JWTUtil.generToken(String.valueOf(user.getId()), user.getUsername(), user.getPassword());
            Cookie c = new Cookie("token",token);
            c.setPath("/");
            c.setMaxAge(60*60);
            response.addCookie(c);
            ModelAndView modelAndView = new ModelAndView("myView5");
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("myView4");
            modelAndView.addObject("msg","登录失败，用户名或邮箱或密码错误，请重新输入");
            return modelAndView;
        }
    }

    @RequestMapping("/u/five")
    public ModelAndView five(){
        /*Cookie c = new Cookie();*/
        ModelAndView modelAndView = new ModelAndView("myView5");
        return modelAndView;
    }

    @RequestMapping("/u/loginOut")
    public ModelAndView loginOut(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        /*Cookie c = new Cookie();*/
        Cookie[] cookies = request.getCookies();
        Cookie cookie = new Cookie("token",null);
        /*if (null != cookies){
            for (Cookie c:cookies){
                if (c.getName().equals("toekn")){
                    Cookie cookie =new Cookie("token",null);
                }
            }
        }*/
        cookie.setMaxAge(0);
        cookie.setPath("/");
        response.addCookie(cookie);
        ModelAndView modelAndView = new ModelAndView("myView4");
        modelAndView.addObject("msg","已退出，请重新登录");
        return modelAndView;

    }
    @RequestMapping("/register")
    public ModelAndView toregister(){
        ModelAndView modelAndView = new ModelAndView("myView6");
        return modelAndView;
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ModelAndView register(HttpServletRequest request,HttpServletResponse response,
            String username,String password,Long mobile ,String vcode){
        ModelAndView modelAndView = new ModelAndView();
        password=MD5.getMd5(password);
        String timecode = (String) request.getSession().getAttribute("vcode");
        Long vmoblie = (Long) request.getSession().getAttribute("phoneNumbers");
        if (!mobile.toString().matches("^(?:\\+?86)?1(?:3\\d{3}|5[^4\\D]\\d{2}|8\\d{3}|7(?:[01356789]\\d{2}|4(?:0\\d|1[0-2]|9\\d))|9[189]\\d{2}|6[567]\\d{2}|4[579]\\d{2})\\d{6}$")){
            modelAndView.addObject("msg","手机号码格式错误");
            modelAndView.setViewName("myView6");
            return modelAndView;
        }

        if (null==username||("").equals(username.trim())){
            modelAndView.addObject("msg","用户名不能为空");
            modelAndView.setViewName("myView6");
            return modelAndView;
        }
        if (null==password||("").equals(password.trim())){
            modelAndView.addObject("msg","密码不能为空");
            modelAndView.setViewName("myView6");
            return modelAndView;
        }
        if (null==mobile||!mobile.equals(vmoblie)){
            modelAndView.addObject("msg","手机号码不能为空或手机号码与接收验证码手机不符");
            modelAndView.setViewName("myView6");
            return modelAndView;
        }
        if (null==vcode||!vcode.equals(timecode)){
            modelAndView.addObject("msg","验证码错误");
            modelAndView.setViewName("myView6");
            return modelAndView;
        }
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);

        List<User> user1 = serviceSelect.getUserService().findUser(userExample);
        if (user1.size()>0){
            modelAndView.addObject("msg","该账户已被使用");
            modelAndView.setViewName("myView6");
            return modelAndView;
        }

        userExample.clear();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        criteria1.andMobileEqualTo(mobile);
        List<User> user2 = serviceSelect.getUserService().findUser(userExample);
        if (user2.size()>0){
            modelAndView.addObject("msg","该手机已被使用");
            modelAndView.setViewName("myView6");
            return modelAndView;
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setMobile(mobile);
        int i =serviceSelect.getUserService().add(user);
        if (i<=0){
            modelAndView.addObject("msg","注册失败");
            modelAndView.setViewName("myView6");
            return modelAndView;
        }
        modelAndView.addObject("msg","注册成功，请登录");
        modelAndView.setViewName("myView4");
        return modelAndView;
    }

    @RequestMapping(value = "/sendvcode",method = RequestMethod.POST)
    public ModelAndView vcode(HttpServletResponse response,HttpServletRequest request,Long phoneNumbers){
        String templateParam = vcodeUtil.createVcode();
        ModelAndView modelAndView = new ModelAndView("myView6");
        request.getSession().setAttribute("vcode",templateParam);
        request.getSession().setAttribute("phoneNumbers",phoneNumbers);
        request.getSession().setMaxInactiveInterval(300);
        long time=0;//上次发送的时间，默认为0
        int number=0;//发送的次数，默认为0
        if(null!=redisUtil.get(phoneNumbers.toString(),CodeNumber.class)){
            //如果不为空，则将time设置为缓存的值
            time = redisUtil.get(phoneNumbers.toString(), CodeNumber.class).getTime();//获取上次发送的时间属性
            //同时获取发送的次数
            number = redisUtil.get(phoneNumbers.toString(), CodeNumber.class).getNumber();
        }
        //如果为空则number和time都为默认值
        System.out.println(time);
        System.out.println(number);
        long curTime=System.currentTimeMillis();
        //如果没有超过一分钟就提示一分钟之内无法再次发送，如果是第一次，time应该为0，一定不会报错
        if((curTime-time)<1000*60){
            //System.out.println("请过一分钟再次发送");
            modelAndView.addObject("mobile","请过一分钟再次发送");
            return modelAndView;
        }else if (curTime-time>24*60*1000*60){
            time=0;
            number=0;
        }
        System.out.println("距离上次发送超过一分钟，可以再次发送");

        //判断是否发送超过十次，超过就报错
        if(number>3){
           // System.out.println("今天已经超过十次，请24小时后再来");
            modelAndView.addObject("mobile","今天已经超过十次，请24小时后再来");
            return modelAndView;
        }
        RedisTemplate redisTemplate=new RedisTemplate();
        codeNumber.setNumber(number+1);
        codeNumber.setTime(System.currentTimeMillis());
        redisUtil.set(phoneNumbers.toString(),codeNumber);
//        Demo demo = new Demo();
        String mobile = demo.mobile(phoneNumbers,templateParam);
        log.info(mobile);
        if(mobile.contains("ok")){
            modelAndView.addObject("mobile","验证码发送成功");
            return modelAndView;
        }else {
            modelAndView.addObject("mobile","如未收到验证码点击再次发送");
            return modelAndView;
        }
    }


    public  void test(HttpServletResponse response,HttpServletRequest request,Long phoneNumbers) {
      /*  MemCachedUtil.getInstance().add("username","luck");
        String username = (String) MemCachedUtil.getInstance().get("username");
        System.out.println(username);*/
       /* boolean today1 = memCachedClient.set("today", "123");
        System.out.println(today1);
        String today = (String) memCachedClient.get("today");
        System.out.println(today);*/

        String sources = "0123456789"; // 加上一些字母，就可以生成pc站的验证码了
        Random rand = new Random();
        StringBuffer flag = new StringBuffer();
        for (int j = 0; j < 6; j++)
        {
            flag.append(sources.charAt(rand.nextInt(9)) + "");
        }
        String templateParam=flag.toString();
        System.out.println(flag.toString());
        request.getSession().setAttribute("vcode",templateParam);

       /* Long phoneNumbers= 18796006044L;*/
//        Demo demo = new Demo();
        String mobile = demo.mobile(phoneNumbers,templateParam);
        System.out.println(mobile);

    }

    @RequestMapping("/regist/mobile")
    public  ModelAndView mRegister(){
        ModelAndView modelAndView = new ModelAndView("myView6");
        return modelAndView;
    }

    @RequestMapping("/regist/mail")
    public  ModelAndView mailRegister(){
        ModelAndView modelAndView = new ModelAndView("myView7");
        return modelAndView;
    }

    @RequestMapping(value = "/regist/mail",method = RequestMethod.POST)
    public ModelAndView registmail(HttpServletRequest request,HttpServletResponse response,
                                 String username,String password,String email ,String vcode){
        ModelAndView modelAndView = new ModelAndView();
        password=MD5.getMd5(password);
        if (!email.matches("^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$")){
            modelAndView.addObject("msg","邮箱格式错误");
            modelAndView.setViewName("myView7");
            return modelAndView;
        }
        String timecode = (String) request.getSession().getAttribute("vcode");
        String vemail = (String) request.getSession().getAttribute("email");
        if (null==username||("").equals(username.trim())){
            modelAndView.addObject("msg","用户名不能为空");
            modelAndView.setViewName("myView7");
            return modelAndView;
        }
        if (null==password||("").equals(password.trim())){
            modelAndView.addObject("msg","密码不能为空");
            modelAndView.setViewName("myView7");
            return modelAndView;
        }
        if (null==email||!email.equals(vemail)){
            modelAndView.addObject("msg","手机号码不能为空或手机号码与接收验证码手机不符");
            modelAndView.setViewName("myView7");
            return modelAndView;
        }
        if (null==vcode||!vcode.equals(timecode)){
            modelAndView.addObject("msg","验证码错误");
            modelAndView.setViewName("myView7");
            return modelAndView;
        }
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> user1 = serviceSelect.getUserService().findUser(userExample);
        if (user1.size()>0){
            modelAndView.addObject("msg","该账户已被使用");
            modelAndView.setViewName("myView7");
            return modelAndView;
        }

        userExample.clear();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        criteria1.andMailboxEqualTo(email);
        List<User> user2 = serviceSelect.getUserService().findUser(userExample);
        if (user2.size()>0){
            modelAndView.addObject("msg","该邮箱已被使用");
            modelAndView.setViewName("myView7");
            return modelAndView;
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setMailbox(email);
        int i =serviceSelect.getUserService().add(user);
        if (i<=0){
            modelAndView.addObject("msg","注册失败");
            modelAndView.setViewName("myView7");
            return modelAndView;
        }
        modelAndView.addObject("msg","注册成功，请登录");
        modelAndView.setViewName("myView4");
        return modelAndView;
    }

    @RequestMapping("/email")
    public ModelAndView toemail(HttpServletResponse response,HttpServletRequest request,String email ) throws IOException {
        ModelAndView modelAndView= new ModelAndView("myView7");
        String vcode = vcodeUtil.createVcode();
        if (!email.matches("^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$")) {
            modelAndView.addObject("message","邮箱格式错误");
            return modelAndView;
        }
        long time=0;//上次发送的时间，默认为0
        int number=0;//发送的次数，默认为0
        if(null!=redisUtil.get(email,CodeNumber.class)){
            //如果不为空，则将time设置为缓存的值
            time = redisUtil.get(email,CodeNumber.class).getTime();//获取上次发送的时间属性
            //同时获取发送的次数
            number = redisUtil.get(email,CodeNumber.class).getNumber();
        }
        //如果为空则number和time都为默认值
        System.out.println(time);
        System.out.println(number);
        long curTime=System.currentTimeMillis();
        //如果没有超过一分钟就提示一分钟之内无法再次发送，如果是第一次，time应该为0，一定不会报错
        if((curTime-time)<1000*60){
            //System.out.println("请过一分钟再次发送");
            modelAndView.addObject("message","请过一分钟再次发送");
            return modelAndView;
        }else if (curTime-time>24*60*1000*60){
            time=0;
            number=0;
        }
        System.out.println("距离上次发送超过一分钟，可以再次发送");

        //判断是否发送超过十次，超过就报错
        if(number>3){
            // System.out.println("今天已经超过十次，请24小时后再来");
            modelAndView.addObject("message","今天已经超过十次，请24小时后再来");
            return modelAndView;
        }
        RedisTemplate redisTemplate=new RedisTemplate();
        codeNumber.setNumber(number+1);
        codeNumber.setTime(System.currentTimeMillis());
        redisUtil.set(email,codeNumber);
        String s = sendCommonPostMail.send_common(email, vcode);
        request.getSession().setAttribute("vcode",vcode);

        request.getSession().setAttribute("email", email);
        log.info(s);
        if (s.contains("false")||s.contains("error")){
            modelAndView.addObject("message","验证码发送失败请确认验证码格式重新认证。");
            return modelAndView;
        }
        modelAndView.addObject("message","验证码发送成功");
        return modelAndView;
    }



    @RequestMapping(value = "/u/fileupload",method = RequestMethod.POST)
    public ModelAndView fileupload(MultipartFile file){
        String localfilepath = file.getOriginalFilename();
        System.out.println("++++++++++++++++++++++++++++"+localfilepath);
        String fileupload = fileuploadUtil.fileupload(file);
        ModelAndView modelAndView = new ModelAndView("myView5");
        if (!fileupload.contains("aliyuncs")){
            modelAndView.addObject("path","图片上传发生错误，请稍后尝试");
            return modelAndView;
        }
        modelAndView.addObject("path",fileupload);
        return modelAndView;
    }

    @RequestMapping(value = "/u/filedownload",method = RequestMethod.POST)
    public ModelAndView filedownload(String filename,HttpServletRequest request){
        String path = fileuploadUtil.downLoadFile(filename,request);
        ModelAndView modelAndView = new ModelAndView("myView5");
        modelAndView.addObject("path",path);
        return modelAndView;
    }

    @RequestMapping(value = "/u/filedownload",method = RequestMethod.GET)
    public ModelAndView filedown(){
        ModelAndView modelAndView = new ModelAndView("myView5");
        return modelAndView;
    }
}

