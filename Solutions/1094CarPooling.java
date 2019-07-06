import java.util.List;
public class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] station = new int[1001];
        for (int i = 0; i < trips.length; i++) {
            for (int j = trips[i][1]; j < trips[i][2]; j++) {
                station[j] += trips[i][0];
                if (station[j] > capacity) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] nums = new int[][] {{3,2,7},{3,7,9},{8,3,9}};
        int target = 11;
        System.out.println(new Solution().carPooling(nums, target));
    }

}
