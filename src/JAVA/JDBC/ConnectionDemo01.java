package JAVA.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by user on 2017/4/29.
 */
public class ConnectionDemo01 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("连接成功");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myjdbc","root","");
            System.out.println(conn);
            Statement stat = conn.createStatement();
            //stat.executeUpdate("insert into jdbc_table (t_name) VALUES ('abc')");
            //int a = stat.executeUpdate("UPDATE jdbc_table SET t_name = 'pqc' WHERE t_id = '123'");
            int a = stat.executeUpdate("DELETE FROM jdbc_table WHERE t_name = 'pqc'");
            System.out.println(a);
            ResultSet res = stat.executeQuery("SELECT * FROM jdbc_table");
            while(res.next()){
                System.out.println(res.getString(1)+"\t"+res.getInt(2));
            }
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
