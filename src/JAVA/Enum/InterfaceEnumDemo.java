package JAVA.Enum;


/**
 * Created by user on 2017/4/25.
 */
public class InterfaceEnumDemo {
    public static void main(String[] args) {
        Print a = Color03.RED;
        System.out.println(a.getColor());
    }
}
interface Print{
    public String getColor();
}
enum Color03 implements Print{
    RED{
        public String getColor(){
            return "红色";
        }
    },
    BLUE{
        public String getColor(){
            return "蓝色";
        }
    }
}
