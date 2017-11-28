package cn.unicyz.proxy.static_proxy;



public class maintest {
    public static void main(String [] args){

        //HelloProxy helloProxy = new HelloProxy();
        //helloProxy.say("Jack");

        /*
        DynamicProxy dynamicProxy = new DynamicProxy(new HelloImpl());

        Hello hello = dynamicProxy.getProxy();
        hello.say("Jack");
        */

        Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        helloProxy.say("Jack");

    }
}
