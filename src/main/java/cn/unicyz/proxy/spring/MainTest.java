package cn.unicyz.proxy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main (String [] args) {

        /*
        //不使用框架之前的步骤
    //1.创建一个HelloWrold对象
    HelloWorld helloWorld = new HelloWorld();
    //2.为实例对象的属性赋值
    helloWorld.setName("Spring");
    //3.调用对象的方法
    helloWorld.sayHello();

    */
        //1.创建一个Spring的IOC容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //2.从IOC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        //3.调用sayHello()方法
        helloWorld.sayHello();


    }

}
