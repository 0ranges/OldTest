package JAVA.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by user on 2017/5/31.
 */
public class WindowEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LYM");
        frame.addWindowListener(new MyWindowEvent());
        frame.setSize(300,300);
        frame.setBackground(Color.WHITE);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
class MyWindowEvent implements WindowListener{
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("WindowOpened -->窗口被打开");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("WindowClosing -->窗口关闭");
        System.exit(1);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("WindowClosed -->窗口被关闭");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("WindowIconified -->窗口最小化");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("WindowDeiconified -->窗口从最小化恢复");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("WindowActivated -->窗口被选中");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("WindowDeactivated -->取消窗口选中");
    }
}