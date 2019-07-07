
public class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] rtn = new int[seq.length()];
        int count = 0;
        for (int i = 1; i < seq.length(); i++) {
            if (seq.charAt(i - 1) == '(' && seq.charAt(i) == ')') {
                rtn[i - 1] = 1;
                rtn[i] = 1;
                count++;
            }
        }
        count = count / 2;
        int index = 0;
        while (index < seq.length() && rtn[index] != 0) {
            if (rtn[index + 1] == 1) {
                rtn[index + 1] = 0;
                rtn[index] = 0;
                count--;
                if (count == 0) break;
            }
            index++;
        }
        return rtn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
