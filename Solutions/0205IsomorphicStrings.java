import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) return false;
            } else {
                if (set.contains(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }   
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("paper", "title"));
    }

}
