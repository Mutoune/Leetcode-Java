import java.util.Arrays;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] rtn = new int[nums.length];
        rtn[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            rtn[i] = rtn[i-1] * nums[i-1];
        }
        int product = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            rtn[i] = rtn[i] * product;
            product = product * nums[i];
        }
        return rtn;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] rtn = new Solution().productExceptSelf(nums);
        System.out.println(Arrays.toString(rtn));
    }

}
