
public class Solution {

    public String convertToTitle(int n) {
        char[] list = new char[26];
        list[0] = 'Z';
        for (int i = 1; i < 26; i++) {
            list[i] = (char)('A' + i - 1);
        }
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            sb.insert(0, list[n % 26]);
            if (n % 26 == 0) n--;
            n = n / 26;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(28));
    }

}
