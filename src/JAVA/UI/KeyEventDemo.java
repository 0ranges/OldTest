package JAVA.UI;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by user on 2017/5/31.
 */
public class KeyEventDemo {
    public static void main(String[] args) {
        new MyKeyEvent();
    }
}
class MyKeyEvent extends JFrame implements KeyListener{
    private JLabel label = new JLabel("你好");
    private JTextArea jta = new JTextArea();

    public MyKeyEvent(){
        JFrame frame = new JFrame("KeyListener");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
        JScrollPane scr = new JScrollPane(jta);
        scr.setBounds(10,50,200,200);
        jta.addKeyListener(this);
        label.setBounds(10,10,100,40);
        frame.setLayout(null);
        frame.add(label);
        frame.add(scr);
        frame.setSize(300,300);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        jta.append("输入"+e.getKeyChar()+"\n");
}

    @Override
    public void keyPressed(KeyEvent e) {
        jta.append("按下"+KeyEvent.getKeyText(e.getKeyCode())+"\n");
        label.setVisible(false);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        jta.append("松开"+KeyEvent.getKeyText(e.getKeyCode())+"\n");
        label.setVisible(true);
    }
}
