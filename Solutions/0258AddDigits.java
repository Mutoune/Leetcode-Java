
public class Solution {

    public int addDigits(int num) {
        return num == 0 ? 0 : num%9 == 0 ? 9 : num%9;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().addDigits(36));
    }
}
