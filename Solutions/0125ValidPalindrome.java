
public class Solution {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while (left < s.length() && right >= 0 && left < right) {
            if (!((s.charAt(left) >= 'a' && s.charAt(left) <= 'z')
                    || (s.charAt(left) >= '0' && s.charAt(left) <= '9'))) {
                left++;
                continue;
            }
            if (!((s.charAt(right) >= 'a' && s.charAt(right) <= 'z')
                    || (s.charAt(right) >= '0' && s.charAt(right) <= '9'))) {
                right--;
                continue;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("0P"));
    }

}
