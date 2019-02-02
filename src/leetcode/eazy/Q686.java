package leetcode.eazy;

/**
 * Created by user on 2018/3/30.
 */
public class Q686 {
    public int repeatedStringMatch(String A, String B) {
        if(A.length()>B.length()){
            if(A.contains(B))
                return 1;
            else if((A+A).contains(B))
                return 2;
            else
                return -1;
        }else{
            int n = B.length()/A.length();
            String str = "";
            for(int i = 0;i<n;i++)
                str +=A;
            if(str.contains(B))
                return n;
            else if((str+A).contains(B))
                return n+1;
            else if((str+A+A).contains(B))
                return n+2;
            else
                return -1;
        }
    }
}
