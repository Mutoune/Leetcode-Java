
public class Solution {

    public int maxSubArray(int[] nums) {
        int max = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp = temp + nums[j];
                if (temp > max) {
                    max = temp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -2};
        System.out.println(new Solution().maxSubArray(nums));
    }
}
