package JAVA.UI;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 2017/6/5.
 */
public class JTableDemo01 {
    public static void main(String[] args) {
        new TableColumnModelDemo();
    }
}
class DefaultTable extends AbstractTableModel{

    private String titles[] = {"姓名","年龄","性格","数学成绩","英语成绩","总分","是否及格"};
    private Object userInfo[][] = {{"pqc",30,"男",80,90,170,true}
            ,{"李康",23,"男",70,60,130,false}
            ,{"李康",23,"男",70,60,130,false}
            ,{"李康",23,"男",70,60,130,false}};

    @Override
    public String getColumnName(int column) {
        return titles[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return getValueAt(0,columnIndex).getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        userInfo[rowIndex][columnIndex] = aValue;
    }

    @Override
    public int getRowCount() {
        return userInfo.length;
    }

    @Override
    public int getColumnCount() {
        return titles.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return userInfo[rowIndex][columnIndex];
    }
}

class TableColumnModelDemo{
    private JFrame frame = new JFrame("Table");
    private JTable table = null;
    private DefaultTable defaultTable = new DefaultTable();
    private JComboBox sexList = new JComboBox();

    public TableColumnModelDemo(){
        table = new JTable(defaultTable);
        sexList.addItem("男");
        sexList.addItem("女");
        table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(sexList));
        JScrollPane jsp = new JScrollPane(table);
        JPanel toolBar = new JPanel();
        frame.add(toolBar, BorderLayout.NORTH);
        frame.add(jsp,BorderLayout.CENTER);
        frame.setSize(370,160);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
}