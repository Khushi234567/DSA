class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || k <= 0){
            return new int[0];
        }
        int n = nums.length;
        int r[] = new int[n-k+1];
        int ri = 0;
        Deque<Integer>q = new LinkedList<>();
        for(int i = 0;i < nums.length;i++){
            //remove numbers out of range k 
            while(!q.isEmpty() && q.peek() < i-k+1){
                q.poll();
            }
            //remove smaller numbers in k range as they are useless
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if( i >= k - 1){
                r[ri++] = nums[q.peek()];
            }
        }
        return r;
    
    }
}
