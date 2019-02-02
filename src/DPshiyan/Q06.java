package DPshiyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by user on 2017/12/24.
 */
public class Q06 {
    public static void main(String[] args) {
        new JInternalFrameDemo();
    }
}
class JInternalFrame1 extends JInternalFrame {
    private static JInternalFrame1 JIF1 = null;
    private JInternalFrame1(String name,boolean b1,boolean b2,boolean b3,boolean b4) {
        super(name, b1, b2, b3, b4);
    }
    public static JInternalFrame1 getJInternalFrame1(String name,boolean b1,boolean b2,boolean b3,boolean b4) {
        if (JIF1 == null)
            JIF1 = new JInternalFrame1(name, b1, b2, b3, b4);
        return JIF1;
    }
}
class JInternalFrameDemo extends JFrame implements ActionListener{
    private static JInternalFrame1 internalFrame;
    Container contentPane = this.getContentPane();
    public JInternalFrameDemo(){
        super("主窗口");
        contentPane.setLayout(new BorderLayout());
        JButton button = new JButton("创建一个子窗口");
        button.addActionListener(this);
        contentPane.add(button,BorderLayout.SOUTH);
        this.setSize(new Dimension(300,300));
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        internalFrame = JInternalFrame1.getJInternalFrame1("子窗体",true,true,true,true);
        internalFrame.setSize(new Dimension(200,200));
        internalFrame.setVisible(true);
        JDesktopPane desktopPane=new JDesktopPane();
        contentPane.add(desktopPane);
        desktopPane.add(internalFrame);
        try {
            internalFrame.setSelected(true);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}