
public class Solution {

    public int tribonacci(int n) {
        int len = Math.max(3, n + 1);
        int[] rtn = new int[len];
        rtn[0] = 0;
        rtn[1] = 1;
        rtn[2] = 1;
        for (int i = 3; i <= n; i++) {
            rtn[i] = rtn[i - 1] + rtn[i -2] + rtn[i - 3];
        }
        return rtn[n];
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
