package JAVA.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 2017/6/1.
 */
public class JRadioButtonDemo01 {
    public static void main(String[] args) {
        new MyRadio01();
    }
}
class MyRadio01 implements ItemListener{
    private String right = "C:\\Users\\user\\Desktop\\实验报告\\对号.jpg";
    private String wrong = "C:\\Users\\user\\Desktop\\实验报告\\错号.png";

    private JFrame frame = new JFrame("ItemListener");
    private Container cont = frame.getContentPane();
    private JRadioButton jrb1 = new JRadioButton("男",new ImageIcon(right),true);
    private JRadioButton jrb2 = new JRadioButton("女",new ImageIcon(wrong),false);
    private JPanel pan = new JPanel();

    public MyRadio01(){
        pan.setBorder(BorderFactory.createTitledBorder("选择性别："));
        pan.setLayout(new GridLayout(1,3));

        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jrb1.addItemListener(this);
        jrb2.addItemListener(this);
        pan.add(jrb1);
        pan.add(jrb2);
        cont.add(pan);
        frame.setSize(500,300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == jrb1){
            jrb1.setIcon(new ImageIcon(right));
            jrb2.setIcon(new ImageIcon(wrong));
        }else{
            jrb1.setIcon(new ImageIcon(wrong));
            jrb2.setIcon(new ImageIcon(right));
        }
    }
}