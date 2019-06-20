
public class Solution {

    public boolean isUgly(int num) {
        while (num % 30 == 0 && num > 0) num /= 30;
        while (num % 6 == 0 && num > 0) num /= 6;
        while (num % 10 == 0 && num > 0) num /= 10;
        while (num % 15 == 0 && num > 0) num /= 15;
        while (num % 2 == 0 && num > 0) num /= 2;
        while (num % 3 == 0 && num > 0) num /= 3;
        while (num % 5 == 0 && num > 0) num /= 5;
        return num == 1;
    }

    public static void main(String[] args) {
        new Solution().isUgly(1);
    }

}
