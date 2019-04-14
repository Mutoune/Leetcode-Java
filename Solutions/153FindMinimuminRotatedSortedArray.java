
public class Solution {
    
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                break;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(new Solution().findMin(nums));
    }

}
