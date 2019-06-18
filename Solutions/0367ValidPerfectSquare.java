    
public class Solution {

    public boolean isPerfectSquare(int num) {
        if (num == 0) return true;
        int i = 1;
        while (num / i > i) {
            i++;
        }
        return (num / i == i) && (num % i == 0) ? true : false;
    }
    public static void main(String[] args) {

    }

}
