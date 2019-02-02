package JAVA.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by user on 2017/4/30.
 */
public class JDBC20Demo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myjd","root","");
        PreparedStatement prep = conn.prepareStatement("SELECT t_name,t_id,t_a FROM jdbc_table ", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet res = prep.executeQuery();
        res.moveToInsertRow();
        res.updateString("t_name","yui");
        res.updateInt("t_id",233);
        res.updateInt("t_a",14);
        res.insertRow();
        res.close();
        prep.close();
        conn.close();
    }
}
