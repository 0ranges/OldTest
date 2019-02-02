package JAVA.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 2017/5/3.
 */
public class JLabelDemo01 {
    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame("MyDemo");

        //File file = new File("C:\\Users\\user\\Desktop\\1222.png");
        //InputStream is = new FileInputStream(file);
        //byte b[] = new byte[(int)file.length()];
        //is.read(b);
        //is.close();
        Icon icon = new ImageIcon("C:\\Users\\user\\Desktop\\1222.png");
        JLabel label = new JLabel("LYM",icon,JLabel.CENTER);
        Font font = new Font("Serief",Font.BOLD+Font.ITALIC,28);
        label.setFont(font);
        label.setBackground(Color.YELLOW);
        label.setForeground(Color.RED);
        frame.add(label);
        frame.setSize(300,160);
        frame.setLocation(200,200);
        frame.setVisible(true);
    }
}
