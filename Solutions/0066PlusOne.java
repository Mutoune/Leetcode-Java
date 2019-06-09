import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int temp = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            list.add((digits[i] + temp) % 10);
            temp = (digits[i]+ temp) / 10;
        }
        if (temp > 0) list.add(temp);
        int[] rtn = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            rtn[list.size() - i - 1] = list.get(i);
        }
        return rtn;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[] {1, 2, 3})));
    }

}
