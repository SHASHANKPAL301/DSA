class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int num:nums){
            low=Math.max(num,low);
            high+=num;
        }
        int res=0;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(splits(nums,k,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;

            }
        
        }
        return res;
    }
    public boolean splits(int[] nums, int k ,int target){
        int currentSubArray=0;
        int splitsRequired=1;
        for(int num:nums){
            if(currentSubArray+num>target){
                currentSubArray=num;
                splitsRequired++;
                if(splitsRequired>k){
                    return false;
                }

            }
            else{
                currentSubArray+=num;
                
            }
            
        }
        return true;
    }
}