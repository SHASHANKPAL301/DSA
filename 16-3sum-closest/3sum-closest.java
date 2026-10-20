class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        Arrays.sort(nums);
        int closest= nums[0]+nums[1]+nums[2];
        for(int i =0;i<n;i++){
            int j= i+1;
            int k= n-1;
            while(j <k ){
                sum = nums[i]+nums[j]+nums[k];
                if(sum == target){
                    return sum;
                }
                else if(Math.abs(sum-target)<Math.abs(closest-target)){
                    closest=sum;
                }
                if(sum <target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closest;
    }
}