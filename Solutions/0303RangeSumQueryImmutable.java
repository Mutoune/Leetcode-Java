import java.util.Arrays;

public class Solution {

    static class NumArray {

        private int[] sums;
        private int[] numlist;
        public NumArray(int[] nums) {
            sums = new int[nums.length];
            numlist = Arrays.copyOf(nums, nums.length);
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                sums[i] = sum;
            }
        }
        
        public int sumRange(int i, int j) {
            return sums[j] - sums[i] + numlist[i];
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        System.out.println(obj.sumRange(2,5));
    }

}
