package JAVA.UI;

import javax.swing.*;

/**
 * Created by user on 2017/5/31.
 */
public class JTextAreaDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WELCOME");
        JTextArea jta = new JTextArea(50,10);
        jta.setBounds(10,10,100,100);
        frame.setLayout(null);
        frame.add(jta);
        frame.setSize(300,300);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
