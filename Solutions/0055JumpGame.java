
public class Solution {

    public boolean canJump(int[] nums) {
        boolean[] rtn = new boolean[nums.length];
        rtn[0] = true;
        for (int i = 1; i < nums.length; i++) {
            rtn[i] = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] >= i - j) {
                    rtn[i] = rtn[i] || rtn[j];
                }
            }
        }
        return rtn[nums.length - 1];
    }
    public static void main(String[] args) {
        System.out.println(new Solution().canJump(new int[] {3,2,1,0,4}));
    }

}
