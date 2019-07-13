
public class Solution {
    public int numberOfDays(int Y, int M) {
        int[] day = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (M == 2) {
            if (Y % 100 == 0) {
                if (Y / 100 % 4 == 0) return 29;
                else return 28;
            } else {
                if (Y % 4 == 0) return 29;
                else return 28;
            }
        } else {
            return day[M - 1];
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
