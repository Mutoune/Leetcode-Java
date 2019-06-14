import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return (int)set.toArray()[0];
    }
    public static void main(String[] args) {

    }

}
