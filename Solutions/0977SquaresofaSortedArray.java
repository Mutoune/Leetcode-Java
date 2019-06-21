import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {

//    public int[] sortedSquares(int[] A) {
//        if (A.length == 0) return A;
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        for (int i = 0; i < A.length; i++) {
//            queue.add(A[i] * A[i]);
//        }
//        int[] list = new int[A.length];
//        for (int i = 0; i < A.length; i++) {
//            list[i] = queue.poll();
//        }
//        return list;
//    }
    public int[] sortedSquares(int[] A) {
        if (A.length == 0) return A;
        int[] list = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            list[i] = A[i] * A[i];
        }
        Arrays.sort(list);
        return list;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
