import java.util.Arrays;

public class Solution {
    
    public int longestPalindrome(String s) {
        if (s.length() == 0) return 0;
        boolean flg = false;
        char[] list = s.toCharArray();
        Arrays.sort(list);
        int rtn = 0, count = 1;
        char target = list[0];
        for (int i = 1; i < list.length; i++) {
            if (target == list[i]) count++;
            else {
                rtn += count / 2 * 2;
                if (count % 2 == 1) flg = true;
                target = list[i];
                count = 1;
            }
        }
        rtn += count / 2 * 2;
        if (count % 2 == 1) flg = true;
        if (flg) rtn++;
        return rtn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
