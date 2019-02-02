package DPshiyan;

/**
 * Created by user on 2017/12/24.
 */
public class Q05 {
    private static Q05[] instance;
    private Q05(){}
    public static Q05 getInstance(int number){
        if(number<=0)
            System.out.println("请输入大于0的整数");
        instance = new Q05[number];
        for(int i = 0;i<number;i++)
            instance[i] = new Q05();
        int x = (int)(Math.random()*number);
        System.out.println("调用第"+(x+1)+"个实例");
        return instance[x];
    }
}
