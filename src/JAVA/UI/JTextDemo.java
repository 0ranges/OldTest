package JAVA.UI;

import javax.swing.*;

/**
 * Created by user on 2017/5/4.
 */
public class JTextDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JText");
        JTextField name = new JTextField(10);
        JTextField noed = new JTextField("ABC",10);
        JLabel nameLabel = new JLabel("输入用户名：");
        JLabel noedLabel = new JLabel("不可编辑文本：");
        noed.setEnabled(false);
        //frame.setLayout(new GridLayout(2,2));
        nameLabel.setBounds(10,10,100,20);
        noedLabel.setBounds(10,40,100,20);
        name.setBounds(110,10,80,20);
        noed.setBounds(110,40,80,20);
        frame.setLayout(null);
        frame.add(nameLabel);
        frame.add(name);
        frame.add(noedLabel);
        frame.add(noed);
        frame.setSize(300,100);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
