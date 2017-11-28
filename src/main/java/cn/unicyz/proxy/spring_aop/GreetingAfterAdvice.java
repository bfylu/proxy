package cn.unicyz.proxy.spring_aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author bfy
 * @version 1.0.0
 * 添加后置增强
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object  result, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("After");
    }
}
