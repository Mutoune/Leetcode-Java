
public class Solution {

    public int coinChange(int[] coins, int amount) {
        int[] changes = new int[amount + 1];
        changes[0] = 0;
        for (int j : coins) if (j <= amount) changes[j] = 1;
        for (int i = 1; i < changes.length; i++) {
            if (changes[i] == 1) continue;
            int min = i + 1;
            changes[i] = -1;
            for (int j : coins) {
                if (i > j && changes[i-j] < min && changes[i-j] != -1) {
                    min = changes[i-j];
                }
            }
            if (min < i + 1) changes[i] = min + 1;
        }
        return changes[amount];
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution().coinChange(new int[] {2,5}, 3));
    }

}
