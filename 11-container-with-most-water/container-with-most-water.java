class Solution{
    //Khushi
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            maxArea = Math.max(maxArea, area);

            // Move the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}



   /* public int maxArea(int[] height) {
        int n = height.length;

        // Left max
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Right max
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int level = Math.max(leftMax[i], rightMax[i]);
            maxArea += level - height[i];
        }

        return maxArea;
    }
}



  /*  public int maxArea(int[] height) {
        int n = height.length;

        //left max
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //right max
          int rightMax[] = new int[n];
          rightMax[n-1] = height[n-1];
          for(int i = n-2;i >=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int maxArea = 0;
        //loop
        for(int i =0;i<n;i++){
            int level = Math.min(leftMax[i],rightMax[i]);
        
        //water level
         maxArea += level-height[i];
        

        
    }
    return maxArea;
}
}*/