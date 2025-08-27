class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int arr[] = new int[n+1];
        for(int i = n-1;i>=0;i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        arr[0] = 1;
        return arr;
    }
}