package JAVA.JDBC;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;

/**
 * Created by user on 2017/4/29.
 */
public class ConnectionDemo02 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("连接成功");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myjd","root","");
//            PreparedStatement stat = conn.prepareStatement("INSERT INTO jdbc_table (t_name,t_id) VALUES (?,?)");
//            stat.setString(1,"abc");
//            stat.setInt(2,123);
            PreparedStatement pstat = conn.prepareStatement("INSERT INTO jdbc_table (t_name,t_id,t_image) VALUES (?,?,?)");
            //File file = new File("D:\\Deo.txt");
            File file  = new File("C:\\Users\\user\\Desktop\\000070.png");
            InputStream input = new FileInputStream(file);
            pstat.setString(1,"企鹅");
            pstat.setInt(2,123);
            pstat.setAsciiStream(3,input,(int)file.length());
            pstat.executeUpdate();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
