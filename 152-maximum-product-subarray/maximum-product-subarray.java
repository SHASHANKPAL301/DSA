class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int minProduct= nums[0];
        int maxProduct = nums[0];
        int result= nums[0];
        for(int i=1;i<n;i++){
            int curr= nums[i];
            if(curr<0){
                int temp=maxProduct;
                maxProduct= minProduct;
                minProduct = temp;
            }
            maxProduct=Math.max(maxProduct*curr,curr);
            minProduct = Math.min(minProduct*curr, curr);
            result= Math.max(result,maxProduct);
        }
        return result;
    }
}