package JAVA.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 2017/5/4.
 */
public class JScrollPaneDemo01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane");
        Container cont =frame.getContentPane();
        Icon image = new ImageIcon("C:\\Users\\user\\Desktop\\实验报告\\-_files\\AD0Ivc-ZBRACGAAg9si0wQUok8CB3QEwowI4mgM.jpg");
        JPanel pan = new JPanel();
        pan.add(new JLabel(image));
        JScrollPane jsp = new JScrollPane(pan,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        cont.add(jsp);
        frame.setSize(300,300);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
