import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Set<Integer>, Integer> map = new HashMap<>();
        int counter = 0;
        for (int[] pair : dominoes) {
            Set<Integer> set = new HashSet<>();
            set.add(pair[0]);
            set.add(pair[1]);
            map.put(set, map.getOrDefault(set, 0) + 1);
        }
        for (Integer value : map.values()) {
            counter += value * (value - 1) / 2;
        }
        return counter;
    }
    public static void main(String[] args) {
        int[][] dominoes = new int[][] {{1,1},{2,2},{1,1},{1,2},{1,2},{1,1}};
        System.out.println(new Solution().numEquivDominoPairs(dominoes));
    }

}
