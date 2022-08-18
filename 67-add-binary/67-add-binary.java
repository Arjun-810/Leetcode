class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuffer s = new StringBuffer();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            sum += (i >= 0) ? a.charAt(i) - '0' : 0;
            sum += (j >= 0) ? b.charAt(j) - '0' : 0;
            s.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
         if(carry > 0)
              s.append(1);
        return s.reverse().toString();
    }
}