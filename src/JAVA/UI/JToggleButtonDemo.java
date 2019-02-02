package JAVA.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 2017/5/4.
 */
public class JToggleButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JToggleButton");
        JToggleButton jtb1 = new JToggleButton("button1",true);
        JToggleButton jtb2 = new JToggleButton("未选中");
        JToggleButton jtb3 = new JToggleButton("Click Me");
        frame.setLayout(new GridLayout(2,2));
        frame.add(jtb1);
        frame.add(jtb2);
        frame.add(jtb3);
        frame.setSize(300,300);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
