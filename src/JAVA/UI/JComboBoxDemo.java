package JAVA.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

/**
 * Created by user on 2017/6/3.
 */
public class JComboBoxDemo {
    public static void main(String[] args) {
        new MyComboBox();
    }
}
class MyComboBox{
    private JFrame frame = new JFrame("ComboBox");
    private Container cont = frame.getContentPane();
    private JComboBox jcb1 = null;
    private JComboBox jcb2 = null;

    public MyComboBox(){
        frame.setLayout(new GridLayout(2,2));
        String nationals[] = {"China","England","America","Japan","France","Germany","Italy","Canada","Austrilia"};
        jcb1 = new JComboBox(nationals);
        Vector<String> vector = new Vector<>();
        vector.add("中国");
        vector.add("英国");
        vector.add("美国");
        jcb2 = new JComboBox(vector);
        jcb1.setEditable(true);
        ComboBoxEditor editor = jcb1.getEditor();
        jcb1.configureEditor(editor,"nihao");
        //jcb1.setEditable(false);
        jcb1.setBorder(BorderFactory.createTitledBorder("hello"));
        jcb2.setBorder(BorderFactory.createTitledBorder("Good morning"));
        jcb1.setMaximumRowCount(3);
        jcb2.setMaximumRowCount(3);
        cont.add(jcb1);
        cont.add(jcb2);
        frame.setSize(300,300);
        frame.setLocation(300,300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }

}
