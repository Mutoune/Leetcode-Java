
public class Solution {

    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;
        return (nums.length + 1) * nums.length / 2 - sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().missingNumber(new int[]{0, 2}));

    }

}
