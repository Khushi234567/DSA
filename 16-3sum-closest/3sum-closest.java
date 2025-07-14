class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = 0;
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0;i<n-2;i++){
            //initialize the left and right pointers
            int l= i+1,r=n-1;

            while(l<r){
                int currSum = nums[i] +nums[l]+nums[r];

                //if|currSum -target|<minDiff, then we have 
                //fpund a triplet which is closer to target

                if(Math.abs(currSum-target)<minDiff){
                    minDiff = Math.abs(currSum - target);
                    res = currSum;
                }
                //if multiple sum are closest take mninmum one
                else if(Math.abs(currSum - target)==minDiff){
                    res = Math.max(res,currSum);
                }
                if(currSum > target){
                    r--;
                }
                else{
                    l++;
                }
            }
           
        }
   return res;
  
}
    }