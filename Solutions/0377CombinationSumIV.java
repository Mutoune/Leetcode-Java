import java.util.Arrays;

public class Solution {

    public int combinationSum4(int[] nums, int target) {
        int[] rtn = new int[target + 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                break;
            }
            rtn[nums[i]] = 1;
        }
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i - nums[j] > 0) {
                    rtn[i] += rtn[i - nums[j]];
                } else break;
            }
        }
        return rtn[target];
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3};
        int target = 4;
        System.out.println(new Solution().combinationSum4(nums, target));
    }

}
