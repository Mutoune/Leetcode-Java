import java.util.Arrays;

public class Solution {

    public int[] diStringMatch(String S) {
        int[] rtn = new int[S.length() + 1];
        int left = 0;
        int right = S.length();
        for (int i = 0; i < S.length(); i++) {
            rtn[i] = S.charAt(i) == 'I' ? left++ : right--;
        }
        rtn[S.length()] = left;
        return rtn;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().diStringMatch("III")));
    }

}
