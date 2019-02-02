package JAVA.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by user on 2017/6/4.
 */
public class JFileChooserDemo {
    public static void main(String[] args) {
        new Note();
    }
}
class Note implements ActionListener{

    private JTextArea area = new JTextArea(8,10);
    private JFrame frame = new JFrame("FileChooser");
    private JButton open = new JButton("打开文件");
    private JButton save = new JButton("保存文件");
    private JLabel label = new JLabel("现在没有打开的文件");
    private JPanel panel = new JPanel();

    public Note(){
        panel.add(open);
        panel.add(save);
        frame.setLayout(new BorderLayout(3,3));
        frame.add(label,BorderLayout.NORTH);
        frame.add(panel,BorderLayout.SOUTH);
        frame.add(new JScrollPane(area),BorderLayout.CENTER);
        frame.setSize(330,180);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
        open.addActionListener(this);
        save.addActionListener(this);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        File file = null;
        int result = 0;
        JFileChooser jfc = new JFileChooser();
        if(e.getSource() == open){
            area.setText("");
            jfc.setApproveButtonText("确定");
            jfc.setDialogTitle("打开文件");
            result = jfc.showOpenDialog(frame);
            if(result == JFileChooser.APPROVE_OPTION){
                file = jfc.getSelectedFile();
                label.setText("打开文件名为："+file.getPath());
            }else if(result == JFileChooser.CANCEL_OPTION){
                label.setText("没有选择任何文件。");
            }else {
                label.setText("操作出现错误");
            }
            if(file != null){
                try{
                    Scanner scanner = new Scanner(new FileInputStream(file));
                    scanner.useDelimiter("\n");
                    while(scanner.hasNext()){
                        area.append(scanner.next());
                        area.append("\n");
                    }
                    scanner.close();
                }catch (Exception ex){
                    label.setText("文件读取错误");
                }
            }
        }
        if(e.getSource() == save){
            result = jfc.showSaveDialog(frame);
            if(result == JFileChooser.APPROVE_OPTION){
                file = jfc.getSelectedFile();
                label.setText("保存文件名为："+file.getName());
            }else if(result == JFileChooser.CANCEL_OPTION){
                label.setText("没有选择文件");
            }else {
                label.setText("操作出现错误");
            }
            if(file != null){
                try {
                    PrintStream ps = new PrintStream(new FileOutputStream(file));
                    ps.print(this.area.getText());
                    ps.close();
                }catch (Exception ex){
                    label.setText("文件保存失败");
                }
            }
        }
    }
}