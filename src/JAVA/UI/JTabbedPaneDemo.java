package JAVA.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 2017/5/3.
 */
public class JTabbedPaneDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane");
        Container cont = frame.getContentPane();
        JTabbedPane tab = new JTabbedPane(JTabbedPane.LEFT);
        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        JButton but = new JButton("A");
        JLabel label = new JLabel("B");
        pan1.add(but);
        pan2.add(label);
        tab.addTab("Tab1",new ImageIcon("C:\\Users\\user\\Desktop\\实验报告\\-_files\\AD0Ivc-ZBRAEGAAg4Za1wQUohM7j6wMwfThQ.png"),pan1,"button");
        tab.addTab("Tab2",null,pan2,"label");
        cont.add(tab);
        frame.setSize(300,300);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
