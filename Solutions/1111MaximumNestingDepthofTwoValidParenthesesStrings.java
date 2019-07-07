
public class Solution {
    public int[] maxDepthAfterSplit(String s) {
        int N = s.length();
        int[] res = new int[N];
        int v1 = 0, v2 = 0;
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                if (v1 < v2) {
                    v1++;
                } else {
                    v2++;
                    res[i] = 1;
                }
            } else {
                if (v1 > v2) {
                    v1--;
                } else {
                    v2--;
                    res[i] = 1;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
