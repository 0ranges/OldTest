package JAVA.UI;

import javax.swing.*;

/**
 * Created by user on 2017/5/31.
 */
public class JPasswordDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome");
        JPasswordField jpf1 = new JPasswordField();
        JPasswordField jpf2 = new JPasswordField();
        jpf2.setEchoChar('*');
        JLabel l1 = new JLabel("默认：");
        JLabel l2 = new JLabel("回显@：");
        l1.setBounds(10,10,100,20);
        l2.setBounds(10,40,100,20);
        jpf1.setBounds(110,10,100,20);
        jpf2.setBounds(110,40,100,20);
        frame.setLayout(null);
        frame.add(l1);
        frame.add(l2);
        frame.add(jpf1);
        frame.add(jpf2);
        frame.setSize(300,100);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
