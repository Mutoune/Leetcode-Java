
public class Solution {

    public int maxProduct(int[] nums) {
        int max = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int temp = 1;
            for (int j = i; j < nums.length; j++) {
                temp = temp * nums[j];
                if (temp > max) {
                    max = temp;
                }
                if (temp == 0) {
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-3,0,1,-2};
        System.out.println(new Solution().maxProduct(nums));
    }
}
