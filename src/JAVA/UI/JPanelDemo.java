package JAVA.UI;

import javax.swing.*;

/**
 * Created by user on 2017/5/3.
 */
public class JPanelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel");
        JPanel pan = new JPanel();
        pan.add(new JLabel("A"));
        pan.add(new JLabel("B"));
        pan.add(new JLabel("C"));
        pan.add(new JButton("A"));
        pan.add(new JButton("B"));
        pan.add(new JButton("C"));
        frame.add(pan);
        frame.pack();
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
