import java.util.Arrays;

public class Solution {
    public int largestUniqueNumber(int[] A) {
        int index = A.length - 1;
        if (index < 0) return -1;
        Arrays.sort(A);
        int target = A[index];
        index--;
        while (index >= 0) {
            if (A[index] == target) {
                while(index >= 0 && A[index] == target) index--;
                if (index < 0) return -1;
                else {
                    target = A[index];
                    index--;
                }
            } else return target;
        }
        return target;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
