class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else{
                max=Math.max(max,prices[i]-minPrice);
            }
        }
        return max;

    }
}