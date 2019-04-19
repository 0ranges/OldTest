package leetcode.eazy;

public class Q482 {
    public String licenseKeyFormatting(String S, int K) {
        int n = S.length();
        int cnt = 0;
        int i = 0;
        for (; i < n; i++) {
            if (S.charAt(i) != '-') {
                cnt++;
            }
        }
        S = S.toUpperCase();
        StringBuilder sb = new StringBuilder();
        i = 0;
        int k = 0;
        int K_ = cnt % K == 0 ? K : cnt % K;
        while (i < n) {
            if (S.charAt(i) == '-') {
                i++;
            } else {
//                if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
//                    sb.append((char) (S.charAt(i) + 26));
//                } else {
//                    sb.append(S.charAt(i));
//                }
                sb.append(S.charAt(i));
                k ++;
                if(k == K_) {
                    k = 0;
                    sb.append('-');
                    K_ = K;
                }
                i++;
            }
        }
        if(sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}

