package JAVA.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 2017/6/4.
 */
public class JMenuDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        JTextArea jta = new JTextArea();
        jta.setEditable(true);
        frame.getContentPane().add(new JScrollPane(jta));
        JMenu menu = new JMenu("文件");
        JMenuBar menuBar = new JMenuBar();
        JMenuItem newItem = new JMenuItem("新建");
        JMenuItem openItem = new JMenuItem("打开");
        JMenuItem closeItem = new JMenuItem("关闭");
        JMenuItem exitItem = new JMenuItem("退出");

        newItem.setMnemonic('n');
        openItem.setMnemonic('o');
        closeItem.setMnemonic('c');
        exitItem.setMnemonic('e');

        newItem.setAccelerator(KeyStroke.getKeyStroke('N', Event.CTRL_MASK));
        openItem.setAccelerator(KeyStroke.getKeyStroke('O', Event.CTRL_MASK));
        closeItem.setAccelerator(KeyStroke.getKeyStroke('C', Event.CTRL_MASK));
        exitItem.setAccelerator(KeyStroke.getKeyStroke('E', Event.CTRL_MASK));

        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append("新建");
            }
        });
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append("打开");
            }
        });
        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append("关闭");
            }
        });
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append("退出");
            }
        });

        menu.add(newItem);
        menu.add(openItem);
        menu.add(closeItem);
        menu.addSeparator();
        menu.add(exitItem);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setSize(300,300);
        frame.setLocation(300,300);
        frame.setVisible(true);
    }
}
