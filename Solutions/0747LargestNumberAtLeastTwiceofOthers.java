import java.util.Arrays;

public class Solution {

    public int dominantIndex(int[] nums) {
        if (nums.length < 2) return 0;
        int[] a = new int[101];
        Arrays.fill(a, -1);
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]] = i;
        }
        int largest = 100;
        while (a[largest] == -1) largest--;
        int second = largest - 1;
        while (a[second] == -1) second--;
        if (second > largest / 2) return -1;
        else return a[largest];
    }
    public static void main(String[] args) {

    }

}
