import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int[] rtn = new int[2];
        int index1 = 0;
        while (index1 < numbers.length - 1 && numbers[index1] <= target / 2) {
            int min = index1 + 1;
            int max = numbers.length - 1;
            while (min < max) {
                int mid = min + (max - min) / 2;
                if (numbers[mid] > target - numbers[index1]) {
                    max = mid;
                } else if (numbers[mid] == target - numbers[index1]){
                    rtn[0] = index1 + 1;
                    rtn[1] = mid + 1;
                    return rtn;
                } else {
                    min = mid + 1;
                }
            }
            if (numbers[max] == target - numbers[index1]){
                rtn[0] = index1 + 1;
                rtn[1] = max + 1;
                return rtn;
            }
            index1++;
        }
        return rtn;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[] {2, 7, 11, 13, 15}, 9)));
    }

}
