package JAVA.UI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 2017/6/5.
 */
public class JTableDemo02 {
    public static void main(String[] args) {
        new ChangeTable();
    }
}
class ChangeTable implements ActionListener{

    private JFrame frame = new JFrame("Table");
    private JTable table = null;
    private DefaultTableModel tableModel = null;
    private String titles[] = {"姓名","年龄","性格","数学成绩","英语成绩","总分","是否及格"};
    private Object userInfo[][] = {{"pqc",30,"男",80,90,170,true}
            ,{"李康",23,"男",70,60,130,false}
            ,{"李康",23,"男",70,60,130,false}
            ,{"李康",23,"男",70,60,130,false}};
    private JButton addRowBtn = new JButton("增加行");
    private JButton removeRowBtn = new JButton("删除行");
    private JButton addColBtn = new JButton("增加列");
    private JButton removeColBtn = new JButton("删除列");

    public ChangeTable(){
        tableModel = new DefaultTableModel(userInfo,titles);
        table = new JTable(tableModel);
        JScrollPane jsp = new JScrollPane(table);
        JPanel toolBar = new JPanel();
        toolBar.add(addRowBtn);
        toolBar.add(removeRowBtn);
        toolBar.add(addColBtn);
        toolBar.add(removeColBtn);
        frame.add(toolBar, BorderLayout.NORTH);
        frame.add(jsp,BorderLayout.CENTER);
        frame.setSize(370,180);
        frame.setVisible(true);

        addRowBtn.addActionListener(this);
        removeRowBtn.addActionListener(this);
        addColBtn.addActionListener(this);
        removeColBtn.addActionListener(this);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addColBtn)
            tableModel.addColumn("新增列");
        if(e.getSource() == addRowBtn)
            tableModel.addRow(new Object[]{});
        if(e.getSource() == removeColBtn){
            int colCount = tableModel.getColumnCount()-1;
            if(colCount >= 0){
                TableColumnModel columnMode = table.getColumnModel();
                TableColumn tableColumn = columnMode.getColumn(colCount);
                columnMode.removeColumn(tableColumn);
                tableModel.setColumnCount(colCount);
            }
        }
        if(e.getSource() == removeRowBtn){
            int rowCount = tableModel.getRowCount()-1;
            if(rowCount>=0){
                tableModel.removeRow(rowCount);
                tableModel.setRowCount(rowCount);
            }
        }
    }
}