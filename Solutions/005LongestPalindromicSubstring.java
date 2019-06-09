
public class Solution {

    static boolean check(String s) {
        int lp = 0;
        int rp = s.length() - 1;
        while (rp >= lp) {
            if (s.charAt(lp) != s.charAt(rp)) {
                return false;
            }
            lp++;
            rp--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        for (int len = s.length(); len > 0; len--) {
            for (int i = 0; i < s.length() - len + 1; i++) {
                if (check(s.substring(i, i + len))) {
                    return s.substring(i, i + len);
                }
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("cbbc"));
    }

}
