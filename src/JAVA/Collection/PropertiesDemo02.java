package JAVA.Collection;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by user on 2017/4/24.
 */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        File file = new File("D:\\pro.properties");
        Properties pro = new Properties();
        try{
            pro.load(new FileInputStream(file));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(pro.getProperty("BJ"));
    }
}
