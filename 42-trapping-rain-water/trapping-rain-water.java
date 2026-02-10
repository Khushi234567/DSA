class Solution {
    public int trap(int[] height) {
      /* int n = height.length;
        if (n == 0) return 0;

        // Step 1: Compute left max boundary
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Step 2: Compute right max boundary
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Step 3: Calculate trapped water
        int trap = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trap += waterLevel - height[i];
        }

        return trap;
    }


       /* int n= height.length;
        //leftmax boundary
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i =1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
            //rightmax 
            int rightMax[] = new int[n];
            rightMax[i-1] = height[i-1];
            for(int i=n-2;i>=0;i--){
                rightMax[i] = Math.max(height[i],rightMax[i+1]);

            }
            int trap =0;
            //loop
            for(int i=0;i<n;i++){
                //waterlevel
                int waterLevel = Math.min(leftMax[i],rightMax[i]);
                //trapped water
                trap += waterLevel-height[i];
            }
            return trap;
        }*/
        int n = height.length;
        if(n == 0){
            return 0;
        }
        //leftmax
        int leftMax[] = new int [n];
        leftMax[0]= height[0];
        for(int i = 1; i < n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //rightMax 
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trap = 0;
        for(int i = 0; i < n;i++){
            int waterLevel =  Math.min(leftMax[i],rightMax[i]);

            trap += waterLevel - height[i];
        }
        return trap;

    }
    }
