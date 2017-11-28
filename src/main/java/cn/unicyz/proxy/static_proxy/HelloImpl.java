package cn.unicyz.proxy.static_proxy;

public class HelloImpl implements Hello {

    @Override
    public void say(String name) {
        System.out.println("Greeting! " + name);
    }
}
