import java.util.Arrays;

public class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]);
        int end = Integer.MIN_VALUE;
        int count = 0;
        for (int[] i : intervals) {
            if (i[0] >= end) {
                end = i[1];
            } else count++;
        }
        return count;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
