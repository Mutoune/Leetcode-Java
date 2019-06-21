
public class Solution {

    public int guessNumber(int n) {
        int min = 1, max = n;
        while (min < max) {
            int mid = (max - min) / 2 + min;
            switch (guess(mid)) {
            case -1:
                max = mid;
                break;
            case 0:
                return mid;
            case 1:
                min = mid + 1;
                break;
            default:
                break;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
