import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean canDivideIntoSubsequences(int[] nums, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (Integer i : nums) {
            int m = map.getOrDefault(i, 0) + 1;
            max = Math.max(m, max);
            map.put(i, m);
        }
        return max * K <= nums.length;
    }
    public static void main(String[] args) {
    }
}
