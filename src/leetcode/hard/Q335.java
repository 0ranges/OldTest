package leetcode.hard;

/**
 * Created by user on 2018/4/11.
 */

//failchar
public class Q335 {
    public boolean isSelfCrossing(int[] x) {
        if(x.length<=3)
            return false;
        if(x[2]<x[0]){
            for(int i = 3;i<x.length;i++)
                if(x[i]>=x[i-2])
                    return true;
            return false;
        }else{
            if(x.length == 4)
                return false;
            if((x[3]<x[1]&&x[4]<x[2])||(x[3]==x[1]&&x[4]+x[0]<x[2])){
                for(int i = 5;i<x.length;i++)
                    if(x[i]>=x[i-2])
                        return true;
                return false;
            }else if(x[3]>x[1]){
                if(x.length ==5)
                    return false;
                if(x[4]>x[2]){
                    for(int i = 5;i<x.length-1;i++)
                        if(x[i]<=x[i-2])
                            return true;
                    return false;
                }else if(x[4]<x[2]-x[0]){
                    for(int i = 5;i<x.length;i++)
                        if(x[i]>=x[i-2])
                            return true;
                    return false;
                }else{
                    if(x[5]>=x[3]-x[1])
                        return true;
                    else{
                        for(int i = 6;i<x.length;i++)
                            if(x[i]>=x[i-2])
                                return true;
                        return false;
                    }
                }
            }else
                return true;
        }
    }
}
