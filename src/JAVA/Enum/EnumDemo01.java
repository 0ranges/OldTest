package JAVA.Enum;

/**
 * Created by user on 2017/4/25.
 */
public class EnumDemo01 {
    public static void main(String[] args) {
        Color01 c = Color01.BLUE;
        System.out.println(c);
        for(Color01 A:Color01.values()){
            System.out.println(A);
            print(A);
        }
    }
    public static void print(Color01 c){
        switch (c){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            default:
                System.out.println("未知颜色");
                break;
        }
    }
}
enum Color01{
    RED,GREEN,BLUE;
}