class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                carry += b.charAt(j) - '0';
                j--;
            }
            
            ans.append(carry % 2);  // add current bit
            carry = carry / 2;      // update carry
        }

        return ans.reverse().toString();
    }
}
