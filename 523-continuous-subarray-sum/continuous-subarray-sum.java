class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //maintain a hash map to store <sum%k,index>

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            sum %=k;

            //case 1 
            if(sum == 0 && i>0){
                return true;
            }
            //case 2
            if(map.containsKey(sum)&& i-map.get(sum)>1){
                return true;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return false;
    }
}