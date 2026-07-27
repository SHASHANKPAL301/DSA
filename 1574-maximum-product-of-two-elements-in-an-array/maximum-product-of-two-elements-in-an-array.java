class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int max=0;
        int prod=0;
       
        for(int i =0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                prod=(nums[i]-1)*(nums[j]-1);
                max=Math.max(prod,max);
            }
                
            
        }
        return max;
    }
}