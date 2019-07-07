import java.util.Arrays;

public class Solution {

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] rtn = new int[n];
        for (int[] temp : bookings) {
            rtn[temp[0] - 1] += temp[2];
            if (temp[1] < n) rtn[temp[1]] -= temp[2];
        }
        for (int i = 1; i < n; i++) {
            rtn[i] = rtn[i - 1] + rtn[i];
        }
        return rtn;
    }
    public static void main(String[] args) {
        int[][] bookings = new int[][] {};
        int n = 5;
        System.out.println(Arrays.toString(new Solution().corpFlightBookings(bookings, n)));
    }

}
