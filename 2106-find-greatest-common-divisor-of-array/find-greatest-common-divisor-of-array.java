class Solution {
    public int findGCD(int[] nums) {
        int small=nums[0];
        int n= nums.length;
        int max=nums[0];
        for(int i =0;i<n;i++){
            small = Math.min(small,nums[i]);
            max=Math.max(max,nums[i]);

        }
        return gcd(small,max);
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
            
        }
        return a;
    }
}