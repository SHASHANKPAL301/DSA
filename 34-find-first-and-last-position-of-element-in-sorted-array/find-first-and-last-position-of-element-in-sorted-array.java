class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=first(nums,target);
        int b= second(nums,target);
        return new int[]{a,b};
    }
    public int first(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
        int mid=low+(high-low)/2;
            if(target==nums[mid]){
                res=mid;
                high=mid-1;
            }
            else if(target>nums[mid]){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return res;
    }

    public int second(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
        int mid=low+(high-low)/2;
            if(target==nums[mid]){
                res=mid;
                low=mid+1;
            }
            else if(target>nums[mid]){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
}