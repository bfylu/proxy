package cn.unicyz.proxy.spring_aop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author bfy
 */
public class SpringAopTest {

    public static void main(String [] args){

        ProxyFactory proxyFactory = new ProxyFactory(); // 创建代理工厂
        proxyFactory.setTarget(new GreetingImpl());  //射入目标类对象
        proxyFactory.addAdvice(new GreetingBeforeAdvice());  //添加前置增强
        proxyFactory.addAdvice(new GreetingAfterAdvice());  //添加后置增强

        GreetingImpl greeting = (GreetingImpl) proxyFactory.getProxy();//从代理工厂中获取代理

        greeting.say("bfy");     //调用代理的方法

    }
}
