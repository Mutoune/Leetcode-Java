
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length && nums[i] < target) {
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[] {1,3,5,6}, 0));
    }

}
