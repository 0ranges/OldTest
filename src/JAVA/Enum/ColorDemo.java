package JAVA.Enum;

/**
 * Created by user on 2017/4/25.
 */
public class ColorDemo {
    public static void main(String[] args) {
        Color color1 = Color.GREEN;
        System.out.println(color1.getName());
        Color color2 = Color.getInstance(2);
        System.out.println(color2.getName());
    }
}
class Color{
    public static final Color RED = new Color("Red");
    public static final Color BLUE = new Color("Blue");
    public static final Color GREEN = new Color("Green");
    private String name;
    private Color(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static Color getInstance(int i){
        switch (i){
            case 1:return RED;
            case 2:return BLUE;
            case 3:return GREEN;
            default:return null;
        }
    }
}
