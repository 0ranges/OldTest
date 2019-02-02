package JAVA.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by user on 2017/4/30.
 */
public class JDBC20BatchDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myjd","root","");
        PreparedStatement prep = conn.prepareStatement("INSERT INTO jdbc_table (t_name,t_id,t_a) VALUES (?,?,?)");
        for(int i = 0 ;i<10;i++){
            prep.setString(1,"qqq"+i);
            prep.setInt(2,i*10);
            prep.setInt(3,i*100);
            prep.addBatch();
        }
        prep.executeBatch();
        prep.close();
        conn.close();
    }
}
