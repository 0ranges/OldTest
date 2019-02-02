package JAVA.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by user on 2017/6/3.
 */
public class ChangeFontDemo {
    public static void main(String[] args) {
        new ComboBox();
    }
}
class ComboBox implements ActionListener,ItemListener{

    private JFrame frame = new JFrame("Font");
    private Container cont = frame.getContentPane();
    private JComboBox jcb = null;
    private JLabel label = new JLabel("Java并发编程");
    private String size[] = {"10","12","14","16","18","20","22","24","26","30","36","48","72"};

    public ComboBox(){
        frame.setLayout(new GridLayout(2,1));
        jcb = new JComboBox(size);
        jcb.setBorder(BorderFactory.createTitledBorder("选择字体大小"));
        jcb.addActionListener(this);
        jcb.addItemListener(this);
        jcb.setMaximumRowCount(3);
        jcb.setEditable(true);
        ComboBoxEditor editor = jcb.getEditor();
        jcb.configureEditor(editor,"12");
        changeFontSize(12);
        cont.add(jcb);
        cont.add(label);
        frame.setSize(300,150);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String itemSize = (String)jcb.getSelectedItem();
        int size_1 = 12;
        try {
            size_1 = Integer.parseInt(itemSize);
        }catch (Exception a){
            jcb.getEditor().setItem("输入的不是数字");
        }
        changeFontSize(size_1);
        if(!isExist(itemSize)){
            jcb.addItem(jcb.getSelectedItem());
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED){
            try {
                changeFontSize(Integer.parseInt((String)e.getItem()));
            }catch (Exception a){

            }
        }
    }
    public boolean isExist(String item){
        boolean flag = false;
        for(int i = 0;i<jcb.getItemCount();i++){
            if(item.equals(jcb.getItemAt(i)));
        }
        return flag;
    }
    public void changeFontSize(int size){
        Font font = new Font("Serief",Font.BOLD,size);
        label.setFont(font);
    }
}