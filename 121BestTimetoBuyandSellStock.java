
public class Solution {

    public int maxProfit(int[] prices) {
        int rtn = 0;
        int size = prices.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (prices[j] - prices[i] > rtn ) {
                    rtn = prices[j] - prices[i];
                }
            }
        }
        return rtn;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(new Solution().maxProfit(prices));
    }

}
