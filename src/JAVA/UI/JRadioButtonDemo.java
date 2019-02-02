package JAVA.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 2017/6/1.
 */
public class JRadioButtonDemo {
    public static void main(String[] args) {
        new MyRadio();
        new MyRadio();
    }
}
class MyRadio{
    private JFrame frame = new JFrame();
    private Container cont = frame.getContentPane();

    private JRadioButton jrb1 = new JRadioButton("天");
    private JRadioButton jrb2 = new JRadioButton("地");
    private JRadioButton jrb3 = new JRadioButton("玄");
    private JRadioButton jrb4 = new JRadioButton("黄");

    private JPanel pan = new JPanel();

    public MyRadio(){
        pan.setBorder(BorderFactory.createTitledBorder("请选择："));
        pan.setLayout(new GridLayout(1,4));
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);
        bg.add(jrb4);
        pan.add(jrb1);
        pan.add(jrb2);
        pan.add(jrb3);
        pan.add(jrb4);
        cont.add(pan);
        frame.setSize(330,80);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
}
