
public class Solution {

    public int titleToNumber(String s) {
        int rtn = 0;
        for (int i = 0; i < s.length(); i++) {
            rtn *= 26;
            rtn += s.charAt(i) - 'A' + 1;
        }
        return rtn;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().titleToNumber("ZA"));
    }

}
