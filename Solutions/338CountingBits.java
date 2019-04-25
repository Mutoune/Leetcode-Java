import java.util.Arrays;

public class Solution {

    public int[] countBits(int num) {
        int[] rtn = new int[num + 1];
        rtn[0] = 0;
        if (num == 0) return rtn;
        rtn[1] = 1;
        if (num == 1) return rtn;
        int j = 2;
        int temp = 2;
        boolean flg = true;
        while (flg) {
            for (int k = 0; k < temp; k++) {
                rtn[j] = rtn[k] + 1;
                j++;
                if (j > num) {
                    flg = false;
                    break;
                }
            }
            temp = temp * 2;
        }
        return rtn;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().countBits(25)));
    }

}
