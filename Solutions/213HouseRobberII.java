
public class Solution {

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int amount = 0;
        int[] robbed = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            robbed[i] = 0;
            for (int j = 0; j < i - 1; j++) {
                if (i - j > 1) {
                    robbed[i] = Math.max(robbed[i], robbed[j]);
                }
            }
            robbed[i] += nums[i];
            amount = Math.max(amount, robbed[i]);
        }
        for (int i = 1; i < nums.length; i++) {
            robbed[i] = 0;
            for (int j = 1; j < i - 1; j++) {
                if (i - j > 1) {
                    robbed[i] = Math.max(robbed[i], robbed[j]);
                }
            }
            robbed[i] += nums[i];
            amount = Math.max(amount, robbed[i]);
        }
        return amount;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().rob(new int[] {1}));
    }

}
