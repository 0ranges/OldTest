package JAVA.Reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by user on 2017/4/18.
 */
public class DynaProxyDemo {
    public static void main(String[] args) {
        MyInvocationHandler handler = new MyInvocationHandler();
        Subject subject = (Subject)handler.bind(new RealSubject());
        String info = subject.say("sam",30);
        System.out.println(info);
    }
}
class MyInvocationHandler implements InvocationHandler{
    private Object object;
    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable{
        Object temp = method.invoke(proxy,args);
        return temp;
    }
}
interface Subject{
    public String say(String name,int age);
}
class RealSubject implements Subject{
    public String say(String name,int age){
        return "name:"+name+",age:"+age;
    }
}