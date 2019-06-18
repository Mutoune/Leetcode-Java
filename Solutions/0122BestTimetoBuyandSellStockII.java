
public class Solution {

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            max += Math.max(0, prices[i + 1] - prices[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
