package JAVA.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 2017/5/31.
 */
public class ActionEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ABC");
        JButton but = new JButton("copy");
        JTextField jtf1 = new JTextField();
        JTextField jtf2 = new JTextField();
        but.setBounds(10,10,100,30);
        jtf1.setBounds(10,40,100,30);
        jtf2.setBounds(10,70,100,30);
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtf2.setText(jtf1.getText());
            }
        });
        frame.setLayout(null);
        frame.add(but);
        frame.add(jtf1);
        frame.add(jtf2);
        frame.setSize(300,300);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
