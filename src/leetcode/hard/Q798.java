package leetcode.hard;

/**
 * Created by user on 2018/4/2.
 */
public class Q798 {
    public static void main(String[] args) {
        System.out.println(bestRotation(new int[]{2,3,1,4,0}));
    }
    public static int bestRotation(int[] A) {
        int minIndex = 0;
        int maxScore = -1;
        int n = A.length;
        for(int i = 0;i<n;i++){
            int score = 0;
            for(int j = 0;j<n;j++){
                if(A[j]<=(j+n-i)%n)
                    score++;
            }
            if(score>maxScore) {
                maxScore = score;
                minIndex = i;
            }
        }
        return minIndex;
    }
    public int bestRotation01(int[] A) {
        int N = A.length;
        int change[] = new int[N];
        for (int i = 0; i < N; ++i) change[(i - A[i] + 1 + N) % N] -= 1;
        int max_i = 0;
        for (int i = 1; i < N; ++i) {
            change[i] += change[i - 1] + 1;
            max_i = change[i] > change[max_i] ? i : max_i;
        }
        return max_i;
    }
}
