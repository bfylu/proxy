package cn.unicyz.proxy.spring_proxy_bean.aop;

import org.aspectj.lang.annotation.*;

public class LogInterceptor {

    @Pointcut("execution(public * cn.unicyz.proxy.spring_proxy_bean.service..*.add(..))")

    public void myMethod(){}

    /*@Before("execution(public void com.oumyye.dao.impl.UserDAOImpl.save(com.oumyye.model.User))")*/
    @Before("myMethod()")
    public void before() {
        System.out.println("method staet");
    }
    @After("myMethod()")
    public void after() {
        System.out.println("method after");
    }
    @AfterReturning("execution(public * com.oumyye.dao..*.*(..))")
    public void AfterReturning() {
        System.out.println("method AfterReturning");
    }
    @AfterThrowing("execution(public * com.oumyye.dao..*.*(..))")
    public void AfterThrowing() {
        System.out.println("method AfterThrowing");
    }

}
