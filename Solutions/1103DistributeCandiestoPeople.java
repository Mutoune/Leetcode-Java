
public class Solution {

    public int[] distributeCandies(int candies, int n) {
        int[] rtn = new int[n];
        int index = 0;
        int step = 1;
        while (true) {
            index = index % n;
            if (candies - step >= 0) {
                rtn[index] += step;
                candies -= step;
            } else {
                rtn[index] += candies;
                break;
            }
            step++;
            index++;
        }
        return rtn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
