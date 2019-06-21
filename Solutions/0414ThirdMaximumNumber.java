
public class Solution {

    public int thirdMax(int[] nums) {
        int[] max = new int[3];
        max[0] = Integer.MIN_VALUE;
        max[1] = Integer.MIN_VALUE;
        max[2] = Integer.MIN_VALUE;
        int count = 0;
        boolean flg = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max[0]) {
                max[2] = max[1];
                max[1] = max[0];
                max[0] = nums[i];
                count++;
            }
            else if (nums[i] > max[1] && nums[i] != max[0]) {
                max[2] = max[1];
                max[1] = nums[i];
                count++;
            } else if (nums[i] > max[2] && nums[i] != max[0] && nums[i] != max[1]) {
                max[2] = nums[i];
                count++;
            } else if (nums[i] == Integer.MIN_VALUE && flg) {
                count++;
                flg = false;
            }
        }
        return count < 3 ? max[0] : max[2];
    }
    public static void main(String[] args) {
        System.out.println(new Solution().thirdMax(new int[] {
-2147483648,-2147483648,-2147483648,-2147483648,1,1,1}));
    }

}
