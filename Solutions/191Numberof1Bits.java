
public class Solution {

    public int hammingWeight(int n) {
        return Integer.toBinaryString(n).replaceAll("0", "").length();
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(00000000000000000000000000001011));
    }

}
