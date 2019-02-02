package JAVA.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 2017/5/3.
 */
public class JSplitPaneDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JSplitPane");
        Container cont = frame.getContentPane();
        JSplitPane lrSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,new JLabel("left"),new JLabel("right"));
        lrSplit.setDividerLocation(30);
        lrSplit.setOneTouchExpandable(true);
        JSplitPane udSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT,lrSplit,new JLabel("down"));
        udSplit.setDividerLocation(100);
        udSplit.setOneTouchExpandable(true);
        cont.add(udSplit);
        frame.setSize(300,300);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
