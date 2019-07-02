
public class Solution {

    public int[] sortArrayByParity(int[] A) {
        int[] rtn = new int[A.length];
        int left = 0, right = A.length - 1;
        for (int i : A) {
            if (i % 2 == 0) {
                rtn[left] = i;
                left++;
            } else {
                rtn[right] = i;
                right--;
            }
        }
        return rtn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
