package JAVA.Collection;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Created by user on 2017/4/24.
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("BJ","Beijing");
        pro.setProperty("TJ","Tianjin");
        pro.setProperty("NJ","Nanjing");
        System.out.println(pro.getProperty("BJ"));
        System.out.println(pro.getProperty("AA"));
        System.out.println(pro.getProperty("AB","Not fount."));
        File file = new File("D:\\pro.properties");
        try{
            pro.store(new FileOutputStream(file),"create");
        }catch (Exception e){
            e.printStackTrace();
        }
        file = new File("D:\\pro.XML");
        try{
            pro.storeToXML(new FileOutputStream(file),"ABC");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
