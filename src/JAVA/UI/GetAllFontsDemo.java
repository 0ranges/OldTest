package JAVA.UI;

import java.awt.*;

/**
 * Created by user on 2017/5/2.
 */
public class GetAllFontsDemo {
    public static void main(String[] args) {
        GraphicsEnvironment eq = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fonts[] = eq.getAvailableFontFamilyNames();
        for(String str:fonts){
            System.out.println(str);
        }
    }
}
