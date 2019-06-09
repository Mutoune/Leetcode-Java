
public class Solution {

    public int numDecodings(String s) {
        int[] rtn = new int[s.length() + 1];
        rtn[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            int temp = Integer.parseInt(s.substring(i-1, i));
            if (temp > 0) {
                rtn[i] = rtn[i - 1];
            }
            if (i - 2 >= 0) {
                temp = Integer.parseInt(s.substring(i-2, i));
                if (temp > 9 && temp <= 26) {
                    rtn[i] += rtn[i - 2];
                }
            }
        }
        return rtn[s.length()];
    }
    public static void main(String[] args) {
        System.out.println(new Solution().numDecodings("01"));
    }
}
