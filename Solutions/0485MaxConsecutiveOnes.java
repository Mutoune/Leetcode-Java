
public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int index = 0;
        int count = 0;
        while (index < nums.length) {
            if (nums[index] == 1) count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }
            index++;
        }
        max = Math.max(max, count);
        return max;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
