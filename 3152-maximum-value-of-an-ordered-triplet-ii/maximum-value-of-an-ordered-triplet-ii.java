class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int leftMax[]= new int[n];
        int rightMax[] = new int[n];
        leftMax[0]= nums[0];
        rightMax[n-1]= nums[n-1];
        long ans=0;
        for(int i=1;i<n;i++){
            leftMax[i]= Math.max(leftMax[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            rightMax[i]= Math.max(rightMax[i+1],nums[i]);

        }

        for(int i=1;i<n-1;i++){
            long value= (long)(leftMax[i-1]-nums[i])* rightMax[i+1];
            ans= Math.max(ans,value);
        }
        return ans;
    }
}