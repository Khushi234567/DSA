class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
      
    Arrays.sort(coins);
    int curr = 1;
    
        // Traverse through all denominations in reverse order
        int count =0, i = 0;
        while(curr <= target){
            if(i<coins.length && coins[i]<=curr){
                curr += coins[i];
                i++;
            }else{
                curr += curr;
                count++;
            }
        }
        return count;
    }
}