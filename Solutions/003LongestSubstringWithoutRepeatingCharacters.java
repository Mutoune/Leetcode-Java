import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        boolean[] check = new boolean[256];
        int lp = 0;
        int rp = 0;
        int max = 0;
        while (lp < s.length() && rp < s.length()) {
            if (check[s.charAt(rp)]) {
                check[s.charAt(lp)] = false;
                lp++;
            } else {
                check[s.charAt(rp)] = true;
                rp++;
            }
            max = Math.max(max, rp - lp);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("au"));
    }

}
