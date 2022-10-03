import java.math.BigInteger;

class Solution {
    public String multiply(String s1, String s2) {
        BigInteger n1 = new BigInteger(s1);
        BigInteger n2 = n1.multiply(new BigInteger(s2));
        return String.valueOf(n2);
    }
}