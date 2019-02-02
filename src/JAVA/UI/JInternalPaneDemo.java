package JAVA.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 2017/5/4.
 */
public class JInternalPaneDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JInternalPane");
        frame.setLayout(new BorderLayout());
        Container cont = frame.getContentPane();
        JDesktopPane jdp = new JDesktopPane();
        cont.add(jdp,BorderLayout.CENTER);
        cont.add(new JLabel("内部窗体"),BorderLayout.SOUTH);
        Icon image = new ImageIcon("C:\\Users\\user\\Desktop\\实验报告\\-_files\\AD0Ivc-ZBRACGAAg9si0wQUok8CB3QEwowI4mgM.jpg");
        JInternalFrame jif = null;
        JPanel pan = null;
        for(int i = 0;i<3;i++){
            jif = new JInternalFrame("JInternalPane-"+(i+1));
            pan = new JPanel();
            pan.add(new JLabel(image));
            jif.setLocation(35-i*10,35-i*10);
            jif.add(pan);
            jif.pack();
            jif.setVisible(true);
            jdp.add(jif);
        }
        frame.setLocation(300,300);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
