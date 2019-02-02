package JAVA.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 2017/5/3.
 */
public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        JButton button = null;
        for(int i = 1;i<=9;i++){
            button = new JButton("Click me - "+i);
            frame.add(button);
        }
        frame.pack();
        frame.setVisible(true);
    }
}
