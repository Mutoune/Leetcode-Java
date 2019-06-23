import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean wordPattern(String pattern, String str) {
        char[] keyList = pattern.toCharArray();
        String[] valueList = str.split(" ");
        if (keyList.length != valueList.length) return false;
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < keyList.length; i++) {
            if (map.containsKey(keyList[i])) {
                if (!map.get(keyList[i]).equals(valueList[i])) return false;
            } else {
                if (set.contains(valueList[i])) return false;
                map.put(keyList[i], valueList[i]);
                set.add(valueList[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
