
public class Solution {

//    public int countPrimes(int n) {
//        if (n < 2) return 0;
//        int count = 1;
//        for (int i = 3; i <= n; i++) {
//            boolean flg = true;
//            for (int j = 2; j <= Math.sqrt(n); j++)
//                if (i % j == 0) {
//                    flg = false;
//                    break;
//                }
//            if (flg) count++;
//        }
//        return count;
//    }
    public int countPrimes(int n) {
        boolean[] list = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!list[i]) {
                count++;
                for (int j = 2; j * i < n; j++) {
                    list[j * i] = true;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
