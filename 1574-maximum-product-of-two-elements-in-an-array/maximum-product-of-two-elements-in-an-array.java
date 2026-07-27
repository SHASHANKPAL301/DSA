class Solution {
    public int maxProduct(int[] nums) {
     int n=nums.length;
     int largest=0;
     int result=0;
     int secondLargest=0;
     for(int i =0;i<n;i++){
        if(nums[i]>largest){
            secondLargest=largest;
            largest=nums[i];
        }
        else if(nums[i]>secondLargest ){
            secondLargest=nums[i];
        }
     }
     result=(largest-1)*(secondLargest-1);
     return result;
    }
}