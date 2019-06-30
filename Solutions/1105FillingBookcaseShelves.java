import java.util.Arrays;

public class Solution {
    
    public int minHeightShelves(int[][] books, int shelf_width) {
        int[] dp = new int[books.length + 1];
        Arrays.fill(dp, 999999999);
        dp[0] = 0;
        for (int i = 1; i <= books.length; i++) {
            int max = 0;
            int temp = shelf_width;
            for (int j = i - 1; j >= 0; j--) {
                max = Math.max(max, books[j][1]);
                temp -= books[j][0];
                if (temp >= 0) {
                    dp[i] = Math.min(dp[i], dp[j] + max);
                }
            }
        }
        return dp[books.length];
    }
    public static void main(String[] args) {

    }

}
