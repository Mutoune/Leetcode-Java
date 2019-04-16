import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> rtn = new HashSet<>();
        if (nums.length == 0) return new ArrayList<List<Integer>>(rtn);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k ) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    rtn.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<List<Integer>>(rtn);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> rtn = new Solution().threeSum(nums);
        for (List<Integer> i : rtn) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
