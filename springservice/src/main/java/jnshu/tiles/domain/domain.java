package jnshu.tiles.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class domain {
    public static void main(String[] args) {
        try {
            //System.setProperty("java.rmi.server.hostname", "140.143.170.92");
            System.setProperty("java.rmi.server.hostname","127.0.0.1");
           // System.setProperty("java.rmi.server.hostname","172.21.0.2");
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring/spring-mybatis.xml");
            applicationContext.getBean("rmiCompanyServiceImpl");
            applicationContext.getBean("rmiStudentServiceImpl");
            applicationContext.getBean("rmiProfessionServiceImpl");
            applicationContext.getBean("rmiUserServiceImpl");
            System.out.println("spingservice服务已经启动，请大佬们准备！");
        } catch (Exception e) {
            System.out.println("异常");
            e.printStackTrace();
        }
    }
}
