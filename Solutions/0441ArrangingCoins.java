
public class Solution {
    public int arrangeCoins(int n) {
        int i = 1; 
        while (n - i >= 0) {
            n -= i;
            i++;
        }
        return i - 1;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
