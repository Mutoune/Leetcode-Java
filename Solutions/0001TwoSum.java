import java.util.HashMap;
import java.util.Map;

public class Solution {

//    public int[] twoSum(int[] nums, int target) {
//        int[] rtn = new int[2];
//        int size = nums.length;
//        for (int i = 0; i < size - 1; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (nums[i] + nums[j] == target) {
////                    rtn[0] = i;
////                    rtn[1] = j;
////                    break;
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return rtn;
//    }

    public int[] twoSum(int[] array, int target) throws IllegalArgumentException {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }
            map.put(array[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = new Solution().twoSum(nums, target);
        System.out.println(nums[ans[0]] + "+" + nums[ans[1]] + "=" + target);
    }

}
