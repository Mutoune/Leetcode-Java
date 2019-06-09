import java.util.HashMap;
import java.util.Map;

public class Solution {

    static boolean check(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                return false;
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        while (len > 1) {
            for (int i = 0; i < s.length() - len + 1; i++) {
                if (check(s.substring(i, i + len))) {
                    return len;
                }
            }
            len--;
        }
        return len;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("au"));
    }

}
