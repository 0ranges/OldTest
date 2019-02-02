package JAVA.JDBC;

import java.sql.*;

/**
 * Created by user on 2017/4/30.
 */
public class TranDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myjd","root","");
        conn.setAutoCommit(false);
        Statement stat = conn.createStatement();
        stat.executeUpdate("INSERT INTO jdbc_table (t_name,t_id,t_a)VALUES ('1','1','7')");
        stat.executeUpdate("INSERT INTO jdbc_table (t_name,t_id,t_a)VALUES ('2','2','8')");
        Savepoint sp = conn.setSavepoint();
        stat.executeUpdate("INSERT INTO jdbc_table (t_name,t_id,t_a)VALUES ('3','3','13')");
        stat.executeUpdate("INSERT INTO jdbc_table (t_name,t_id,t_a)VALUES ('4','4','41')");
        stat.executeUpdate("INSERT INTO jdbc_table (t_name,t_id,t_a)VALUES ('5','5','51')");
        stat.executeUpdate("INSERT INTO jdbc_table (t_name,t_id,t_a)VALUES ('6','6','61')");
//        try{
//            int temp[] = stat.executeBatch();
//            System.out.println(temp.length);
//            conn.commit();
//        }catch (Exception e){
//            try{
//                conn.rollback();
//            }catch (Exception ex){
//                ex.printStackTrace();
//            }
//        }
        try{
            conn.rollback(sp);
            conn.commit();
            System.out.println("ok");
        }catch (Exception e){
            e.printStackTrace();
        }
        stat.close();
        conn.close();
    }
}
