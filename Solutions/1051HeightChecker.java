import java.util.Arrays;

public class Solution {

    public int heightChecker(int[] heights) {
        int[] right = Arrays.copyOf(heights, heights.length);
        int count = 0;
        Arrays.sort(right);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != right[i]) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
