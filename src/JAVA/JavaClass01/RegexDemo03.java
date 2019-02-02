package JAVA.JavaClass01;

/**
 * Created by user on 2017/3/29.
 */
public class RegexDemo03 {
    public static void main(String args[]){
        String info = "ABC:12|BCD:32|AQW:11";
        String str[] = info.split("\\|");
        for(int i = 0;i<str.length;i++){
            String a[] = str[i].split(":");
            System.out.print("|-");
            for(int j = 0;j<a.length;j++){
                System.out.print(a[j]+"\t");
            }
            System.out.println();
        }
    }
}
