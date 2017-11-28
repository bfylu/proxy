package cn.unicyz.proxy.spring_aop;

import cn.unicyz.proxy.static_proxy.Hello;

/**
 * @author bfy
 */
public class GreetingImpl implements Hello {

    @Override
    public void say(String name) {
        System.out.println("Greeting! " + name);
    }

}
