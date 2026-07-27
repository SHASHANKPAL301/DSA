class Solution {
    public int majorityElement(int[] nums) {
        int container=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                container=num;
            }
            if(container==num){
                count++;
            }else{
                count--;
            }
        }
        return container;
    }
}