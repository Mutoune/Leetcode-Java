
public class Solution {

    public void moveZeroes(int[] nums) {
        int zero = 0;
        int index = 0;
        while (index < nums.length) {
            if (nums[index] == 0) zero++;
            else {
                nums[index - zero] = nums[index];
            }
            index++;
        }
        for (int i = nums.length - zero; i < nums.length; i++) nums[i] = 0;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {0, 0, 1};
        new Solution().moveZeroes(nums);
    }

}
