package cn.unicyz.proxy.spring;

public class HelloWorld {
    private String name;
    public void setName(String naem){
        this.name = naem;
    }

    public void sayHello() {
        System.out.println("Hello----->>>"+name);
    }
}
