package JAVA.UI;

import javax.swing.*;

/**
 * Created by user on 2017/6/5.
 */
public class JTableDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table");
        String titles[] = {"姓名","年龄","性格","数学成绩","英语成绩","总分","是否及格"};
        Object userInfo[][] = {{"pqc",30,"男",80,90,170,true}
                              ,{"李康",23,"男",70,60,130,false}
                              ,{"李康",23,"男",70,60,130,false}
                              ,{"李康",23,"男",70,60,130,false}};
        JTable table = new JTable(userInfo,titles);
        JScrollPane jsp = new JScrollPane(table);
        frame.add(jsp);
        frame.setSize(400,90);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
