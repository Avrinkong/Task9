package jnshu.tiles.utils;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeAop {

    private long startTime;

    //声明切面类路径，类型必须为final String类型的,注解里要使用的变量只能是静态常量类型的
    //public static final String POINT = "execution(* com.product.service.*.*(..))";
    //也可以使用注解声明切入点,如下
   /* @Pointcut("execution(* jnshu.tiles.*.*(..))")
    public void point(){}*/

    @Before("execution(* jnshu.tiles.service.*.*(..))")
    public void doBefore(){
        this.startTime = System.currentTimeMillis();
    }


    @After("execution(* jnshu.tiles.service.*.*(..))")
    public void doAfter(){
        long endTime = System.currentTimeMillis();
        System.out.println("方法执行了"+(endTime-this.startTime)+"ms");
    }


}
