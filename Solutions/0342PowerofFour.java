
public class Solution {

    public boolean isPowerOfFour(int num) {
        int maxPow = (int)Math.pow(2, (int)(Math.log(Integer.MAX_VALUE) / Math.log(2)));
        return num > 0 && maxPow % Math.sqrt(num) == 0;
    }
    public static void main(String[] args) {

    }

}
