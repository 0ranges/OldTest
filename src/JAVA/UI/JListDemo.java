package JAVA.UI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

/**
 * Created by user on 2017/6/1.
 */
public class JListDemo {
    public static void main(String[] args) {
        new MyList();
    }
}
class MyList{
    private JFrame frame = new JFrame("List");
    private Container cont = frame.getContentPane();
    private JList list1 = null;
    private JList list2 = null;

    public MyList(){
        frame.setLayout(new GridLayout(1,3));
        String nationals[] = {"China","England","America","Japan","France","Germany","Italy","Canada","Austrilia"};
        list1 = new JList(nationals);
        Vector<String> vector = new Vector<>();
        vector.add("中国");
        vector.add("英国");
        vector.add("美国");
        list2 = new JList(vector);

        list1.setBorder(BorderFactory.createTitledBorder("请选择一个国家："));
        list2.setBorder(BorderFactory.createTitledBorder("Please choose a country:"));

        list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int temp[] = list1.getSelectedIndices();
                System.out.print("output:");
                for(int i:temp){
                    System.out.print(list1.getModel().getElementAt(i)+",");
                }
                System.out.println();
            }
        });

        JScrollPane scr = new JScrollPane(list1);
        cont.add(scr);
        cont.add(list2);

        frame.setSize(330,180);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
}
