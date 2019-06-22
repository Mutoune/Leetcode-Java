import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<>();
        if (digits.length() == 0) return null;
        Map<Integer, char[]> map = new HashMap<>();
        map.put(2, new char[] {'a', 'b', 'c'});
        map.put(3, new char[] {'d', 'e', 'f'});
        map.put(4, new char[] {'g', 'h', 'i'});
        map.put(5, new char[] {'j', 'k', 'l'});
        map.put(6, new char[] {'m', 'n', 'o'});
        map.put(7, new char[] {'p', 'q', 'r', 's'});
        map.put(8, new char[] {'t', 'u', 'v'});
        map.put(9, new char[] {'w', 'x', 'y','z'});
        list.add("");
        for (int i = 0; i < digits.length(); i++) {
            int target = Integer.parseInt(digits.substring(i, i + 1));
            while (list.peek().length() == i) {
                for (int k = 0; k < map.get(target).length; k++) {
                    list.add(list.peek() + map.get(target)[k]);
                }
                list.poll();
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("2334").toString());
    }

}
