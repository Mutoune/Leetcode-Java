
public class Solution {

    public int[] sortArrayByParityII(int[] A) {
        int[] rtn = new int[A.length];
        int odd = 1, even = 0;
        for (int i : A) {
            if (i % 2 == 0) {
                rtn[even] = i;
                even += 2;
            } else {
                rtn[odd] = i;
                odd += 2;
            }
        }
        return rtn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
