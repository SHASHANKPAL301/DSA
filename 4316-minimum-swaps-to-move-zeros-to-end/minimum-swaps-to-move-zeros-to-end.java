class Solution {
    public int minimumSwaps(int[] nums) {
        int count=0;
        int res=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int last=n-count;
        for(int i=last;i<n;i++){
            if(nums[i]!=0){
                res++;
            }
        }
        return res;
    }
}