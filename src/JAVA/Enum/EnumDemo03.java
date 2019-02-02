package JAVA.Enum;

/**
 * Created by user on 2017/4/25.
 */
public class EnumDemo03 {
    public static void main(String[] args) {
        Fruit01 f = Fruit01.APPLE;
        f = Enum.valueOf(Fruit01.class,"APPLE");
        f.setName("aa");
        f.setName("苹果");
        System.out.println(f.getName());
    }
}
enum Fruit01{
    APPLE,ORANGE,WATERMELON;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        switch (this){
            case APPLE:
                if("苹果".equals(name)){
                    this.name = name;
                }else {
                    System.out.println("设置内容错误");
                }
                break;
            case ORANGE:
                if("橘子".equals(name)){
                    this.name = name;
                }else {
                    System.out.println("设置内容错误");
                }
                break;
            case WATERMELON:
                if("西瓜".equals(name)){
                    this.name = name;
                }else {
                    System.out.println("设置内容错误");
                }
                break;
            default:break;
            }
    }
}
