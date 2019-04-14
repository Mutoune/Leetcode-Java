
public class Solution {

    public int search(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
            if (nums[i] > target && i > 0 && nums[i - 1] < target) {
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        System.out.println(new Solution().search(nums, target));
    }

}
