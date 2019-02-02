package JAVA.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 2017/5/2.
 */
public class JframeDemo01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World!");
        JLabel table = new JLabel("Lym", JLabel.CENTER);
        Font font = new Font("Serief",Font.BOLD+Font.ITALIC,28);
        table.setFont(font);

        table.setForeground(Color.RED);
        Dimension d = new Dimension();
        //frame.add(table);
        Container container = frame.getContentPane();
        container.add(table);
        d.setSize(200,200);
       // frame.setSize(230,80);
        frame.setSize(d);
        frame.setBackground(Color.WHITE);
        Point point = new Point(300,300);
        frame.setLocation(point);
        frame.setVisible(true);
    }
}
