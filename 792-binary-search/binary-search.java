class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            //compare
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        
       Solution obj = new Solution();  // Create an object to call non-static method

        int[] nums = {-1, 0, 3, 5, 9, 12}; // Example input
        int target = 9;

        int result = obj.search(nums, target);
        System.out.println("Target found at index: " + result);
    }
}