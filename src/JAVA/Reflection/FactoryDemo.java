package JAVA.Reflection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Created by user on 2017/4/18.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Properties pro = Init.getPro();
        Fruit fruit = Factory.getInstance(pro.getProperty("orange"));
        if(fruit != null){
            fruit.eat();
        }
    }
}
interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("** eat apple.");
    }
}
class Orange implements Fruit{
    public void eat(){
        System.out.println("** eat orange.");
    }
}
class Factory{
    public static Fruit getInstance(String str){
        Fruit fruit = null;
        try{
            fruit = (Fruit)Class.forName(str).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return fruit;
    }
}
class Init{
    public static Properties getPro(){
        Properties pro = new Properties();
        File file = new File("D:\\fruit.properties");
        try{
            if(file.exists()){
                pro.load(new FileInputStream(file));
            }else{
                pro.setProperty("apple","JAVA.Reflection.Apple");
                pro.setProperty("orange","JAVA.Reflection.Orange");
                pro.store(new FileOutputStream(file),"FRUIT.CLASS");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return pro;
    }
}