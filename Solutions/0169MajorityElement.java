import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new TreeMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > nums.length / 2) {
//                return entry.getKey();
//            }
//        }
//        return 0;
//    }
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len/2];
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
