package JAVA.Enum;

/**
 * Created by user on 2017/4/25.
 */
public class EnumDemo02 {
    public static void main(String[] args) {
        for(Fruit f :Fruit.values()){
            System.out.println(f.ordinal()+"   "+f.name()+"  "+f.getName());
        }
    }
}
enum Fruit{
    Apple("苹果"),Orange("橘子"),Watermelon("西瓜");
    private Fruit(String name){
        this.name = name;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}