package JAVA.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 2017/5/3.
 */
public class CardLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout");
        Container cont = frame.getContentPane();
        CardLayout card = new CardLayout();
        frame.setLayout(card);
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Tencent Files\\864160262\\FileRecv\\QQ图片20160719115757.jpg"),JLabel.CENTER),"1");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Tencent Files\\864160262\\FileRecv\\QQ图片20160719115811.jpg"),JLabel.CENTER),"2");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Tencent Files\\864160262\\FileRecv\\QQ图片20160719115815.jpg"),JLabel.CENTER),"3");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Tencent Files\\864160262\\FileRecv\\QQ图片20160719115819.jpg"),JLabel.CENTER),"4");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Tencent Files\\864160262\\FileRecv\\QQ图片20160719115824.jpg"),JLabel.CENTER),"5");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Tencent Files\\864160262\\FileRecv\\QQ图片20160719115831.jpg"),JLabel.CENTER),"6");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Tencent Files\\864160262\\FileRecv\\QQ图片20160719115834.jpg"),JLabel.CENTER),"7");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Tencent Files\\864160262\\FileRecv\\QQ图片20160719115838.jpg"),JLabel.CENTER),"8");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Tencent Files\\864160262\\FileRecv\\QQ图片20160719115841.jpg"),JLabel.CENTER),"9");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Tencent Files\\864160262\\FileRecv\\QQ图片20160719115846.jpg"),JLabel.CENTER),"10");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Documents\\Tencent Files\\864160262\\FileRecv\\QQ图片20160719115850.jpg"),JLabel.CENTER),"11");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Desktop\\Yellow.png"),JLabel.CENTER),"1");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Desktop\\Red.png"),JLabel.CENTER),"2");
        cont.add(new JLabel(new ImageIcon("C:\\Users\\user\\Desktop\\Blue.png"),JLabel.CENTER),"3");
        frame.pack();
        frame.setVisible(true);
        card.show(cont,"1");
        while(true){
            try{
                Thread.sleep(50);
            }catch (Exception e){
                e.printStackTrace();
            }
            card.next(cont);
        }
    }
}
