package JAVA.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 2017/5/3.
 */
public class JButtonDemo01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ButtonDemo");
        JButton button = new JButton("Click me!");
        button.setBounds(50,30,60,60);
        Font font = new Font("Serief",Font.BOLD,28);
        button.setFont(font);
        frame.add(button);
        frame.setSize(500,300);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
