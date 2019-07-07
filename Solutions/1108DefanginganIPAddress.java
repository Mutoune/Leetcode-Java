
public class Solution {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    public static void main(String[] args) {
        System.out.println(new Solution().defangIPaddr("255.255.255.1"));
    }

}
