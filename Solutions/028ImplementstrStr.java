
public class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int i = 0;
        int j = 0;
        while (i < haystack.length() - needle.length() + 1) {
            if (haystack.charAt(i+j) == needle.charAt(j)) {
                j++;
            } else {
                j = 0;
                i++;
            }
            if (j == needle.length()) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().strStr("mississippi", "issip"));
    }

}
