package JAVA.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 2017/6/3.
 */
public class ListModelDemo {
    public static void main(String[] args) {
        new MyList01();
    }
}
class MyListModel extends AbstractListModel{

    private String nationals[] = {"China","England","America","Japan","France","Germany","Italy","Canada","Austrilia"};

    @Override
    public int getSize() {
        return this.nationals.length;
    }

    @Override
    public Object getElementAt(int index) {
        return this.nationals[index];
    }
}
class MyList01{
    private JFrame frame = new JFrame("List");
    private Container cont = frame.getContentPane();
    private JList list = null;

    public MyList01(){
        list = new JList(new MyListModel());
        list.setBorder(BorderFactory.createTitledBorder("choose a country:"));
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        cont.add(list);
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