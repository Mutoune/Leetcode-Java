import java.util.Arrays;

public class Solution {

    public int sumOfDigits(int[] A) {
        Arrays.sort(A);
        int target = A[0];
        int sum = 0;
        while (target > 0) {
            sum += target % 10;
            target = target / 10;
        }
        if (sum % 2 == 0) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
