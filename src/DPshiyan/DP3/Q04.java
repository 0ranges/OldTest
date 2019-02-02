package DPshiyan.DP3;

/**
 * Created by user on 2018/1/13.
 */
public class Q04 {
    public static void main(String[] args) {
        Picture picture = (Picture)XMLUtil.getBean("software");
        picture.run();
    }
}
interface Software{
    public void run();
}
class Application implements Software{
    public void run(){
        System.out.println("Application is running.");
    }
}
class Picture implements Software{
    Application app;
    public Picture(){
        app = new Application();
    }
    public void run(){
        app.run();
    }
}