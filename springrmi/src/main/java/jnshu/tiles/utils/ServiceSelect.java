package jnshu.tiles.utils;

import jnshu.tiles.service.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@SuppressWarnings("Duplicates")
@Component
public class ServiceSelect {

    Logger logger = Logger.getLogger(ServiceSelect.class);
    @Qualifier("CompanyServiceRmi01")
    @Autowired
    CompanyService companyServiceRmi01;
    @Qualifier("StudentServiceRmi01")
    @Autowired
    StudnetService studentServiceRmi01;
    @Qualifier("ProfessionServiceRmi01")
    @Autowired
    ProfessionService professionServiceRmi01;
    @Qualifier("UserServiceRmi01")
    @Autowired
    UserService userServiceRmi01;

    @Qualifier("HelloServiceRmi01")
    @Autowired
    HelloService helloServiceRmi01;

    @Qualifier("CompanyServiceRmi02")
    @Autowired
    CompanyService companyServiceRmi02;
    @Qualifier("StudentServiceRmi02")
    @Autowired
    StudnetService studentServiceRmi02;
    @Qualifier("ProfessionServiceRmi02")
    @Autowired
    ProfessionService professionServiceRmi02;
    @Qualifier("UserServiceRmi02")
    @Autowired
    UserService userServiceRmi02;
    @Qualifier("HelloServiceRmi02")
    @Autowired
    HelloService helloServiceRmi02;

    public CompanyService getCompanyService() {
        Integer random = new Random().nextInt(2);
        System.out.println(random);
        if (0 == random) {
            try {
                //判断1号服务是否可用
             //   helloService01.hello();
                helloServiceRmi01.SayHello();
                return companyServiceRmi01;
            } catch (Exception e) {
                return companyServiceRmi02;
            }
        }else {
            try {
               helloServiceRmi02.SayHello();
                return companyServiceRmi02;
            } catch (Exception e) {
                return companyServiceRmi01;
            }
        }
    }

    public StudnetService getStudentService() {
        Integer random = new Random().nextInt(2);
        if (0 == random) {
            try {
                helloServiceRmi01.SayHello();
                return studentServiceRmi01;
            } catch (Exception e) {
                return studentServiceRmi02;
            }
        }else {
            try {
                helloServiceRmi02.SayHello();
                return studentServiceRmi02;
            } catch (Exception e) {
                return studentServiceRmi01;
            }
        }
    }

    public ProfessionService getProfessionService() {
        Integer random = new Random().nextInt(2);
        if (0 == random) {
            try {
                helloServiceRmi01.SayHello();
                return professionServiceRmi01;
            } catch (Exception e) {
                return professionServiceRmi02;
            }
        }else {
            try {
                helloServiceRmi02.SayHello();
                return professionServiceRmi02;
            } catch (Exception e) {
                return professionServiceRmi01;
            }
        }
    }

    public UserService getUserService() {
        Integer random = new Random().nextInt(2);
        if (0 == random) {
            try {
                helloServiceRmi01.SayHello();
                return userServiceRmi01;
            } catch (Exception e) {
                return userServiceRmi02;
            }
        }else {
            try {
                helloServiceRmi02.SayHello();
                return userServiceRmi02;
            } catch (Exception e) {
                return userServiceRmi01;
            }
        }
    }
}