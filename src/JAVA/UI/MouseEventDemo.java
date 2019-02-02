package JAVA.UI;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 2017/5/31.
 */
public class MouseEventDemo {
    public static void main(String[] args) {
        new MyMouseEvent();
    }
}
class MyMouseEvent extends JFrame implements MouseListener{

    private JButton but = new JButton("你点不到我");
    private JTextArea jta = new JTextArea();
    private JLabel label = new JLabel();

    public MyMouseEvent(){
        JFrame frame = new JFrame("Mouse");
        JScrollPane scr = new JScrollPane(jta);
        frame.setLayout(null);
        but.setBounds(10,10,100,50);
        label.setBounds(150,10,100,50);
        scr.setBounds(10,70,200,200);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
        frame.add(but);
        frame.add(label);
        frame.add(scr);
        //jta.addMouseListener(this);
        but.addMouseListener(this);
        frame.setSize(300,300);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        jta.append("X:"+e.getX()+"  Y:"+e.getY()+"\n");
        label.setText(String.valueOf(e.getClickCount()));
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        but.setVisible(false);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        but.setVisible(true);
    }
}