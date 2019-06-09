
public class Solution {

    public int climbStairs(int n) {
        int[] route = new int[n + 1];
        route[0] = 0;
        if (n == 0) return 0;
        route[1] = 1;
        if (n == 1) return 1;
        route[2] = 2;
        if (n == 2) return 2;
        for (int i = 3; i < n + 1; i++) {
            route[i] = route[i-1] + route[i-2];
        }
        return route[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(15));
    }

}
