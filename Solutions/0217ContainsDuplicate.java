
public class Solution {

    public boolean containsDuplicate(int[] nums) {
        boolean flg = false;
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if(nums[i] == nums[j]) {
                    flg = true;
                    break;
                }
            }
        }
        return flg;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(new Solution().containsDuplicate(nums));
    }

}
