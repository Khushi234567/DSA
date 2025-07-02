class Solution {
    public int maxAscendingSum(int[] nums) {

        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currSum += nums[i];
            } else {
                currSum = nums[i];
            }
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;

        //kadane algo
       /* int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i<nums.length;i++){
            cs = cs + nums[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        return ms;
        /*int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int[nums.length];
        prefix[0] = nums[0];

        //calculate prefix sum
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+nums[i];

        }

        for(int i = 0;i<nums.length;i++){
            int start = i;

        for(int j = 0;j<nums.length;j++){
            int end = j;

            currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1]; 
            if(maxSum < currSum){
                maxSum = currSum;
            }

        }
        }
        return maxSum;*/
    }
    
}