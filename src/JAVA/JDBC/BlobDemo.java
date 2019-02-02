package JAVA.JDBC;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by user on 2017/4/29.
 */
public class BlobDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("连接成功");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myjd","root","");
            PreparedStatement pstat = conn.prepareStatement("SELECT t_image FROM jdbc_table WHERE t_name = ?");
            pstat.setString(1,"pqc");
            ResultSet res = pstat.executeQuery();
            if(res.next()){
                InputStream input = res.getAsciiStream(1);
                FileOutputStream fos = new FileOutputStream(new File("D:\\123.png"));
                int temp = 0;
                while((temp = input.read())!=-1){
                    fos.write(temp);
                }
                input.close();
                fos.close();
            }
            System.out.println("ok");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
