
public class Solution {

    public int lengthOfLIS(int[] nums) {
        int rtn = 0;
        if (nums.length == 0) return rtn;
        int[] max = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int maxnum = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    maxnum = Math.max(maxnum, max[j]);
                }
            }
            max[i] = maxnum + 1;
            rtn = Math.max(rtn, max[i]);
        }
        return rtn;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLIS(new int[] {1,3,6,7,9,4,10,5,6}));
    }
}
