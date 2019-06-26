import java.util.HashSet;
import java.util.Set;

public class Solution {

    public void setZeroes(int[][] a) {
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    x.add(i);
                    y.add(j);
                }
            }
        }
        for (Integer i : x) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = 0;
            }
        }
        for (Integer i : y) {
            for (int j = 0; j < a.length; j++) {
                a[j][i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
