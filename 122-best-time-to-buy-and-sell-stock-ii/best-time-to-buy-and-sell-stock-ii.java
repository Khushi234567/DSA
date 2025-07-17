class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;

        for(int i = 1; i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}
       
     /*  int  buyPrice = Integer.MAX_VALUE;
       int maxProfit = 0;

       for(int i = 1 ;i<prices.length;i++){
        if(buyPrice < prices[i]){
            int profit = prices[i]-buyPrice;
            maxProfit = Math.max(maxProfit,profit);
        }else{
            buyPrice = prices[i];
        }
       } 
       return maxProfit;
    }
}*/