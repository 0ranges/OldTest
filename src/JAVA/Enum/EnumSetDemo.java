package JAVA.Enum;

import java.util.EnumSet;

/**
 * Created by user on 2017/4/25.
 */
public class EnumSetDemo {
    public static void main(String[] args) {
        //EnumSet<Color02> enumSet = EnumSet.of(Color02.BLUE);
        // EnumSet<Color02> enumSet = EnumSet.allOf(Color02.class);
        EnumSet<Color02> enumSet = EnumSet.noneOf(Color02.class);
        enumSet.add(Color02.BLUE);
        enumSet.add(Color02.GREEN);
        EnumSet<Color02> enumSet1 = EnumSet.complementOf(enumSet);
        EnumSet<Color02> enumSet2 = EnumSet.copyOf(enumSet);

        for(Color02 c:enumSet){
            System.out.println(c+" ");
        }
        System.out.println();
        for(Color02 c:enumSet1){
            System.out.println(c+" ");
        }
        System.out.println();
        for(Color02 c:enumSet2){
            System.out.println(c+" ");
        }
    }
}
