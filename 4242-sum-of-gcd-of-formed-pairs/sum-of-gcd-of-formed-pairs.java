class Solution {
    public long gcdSum(int[] nums) {
        int n= nums.length;
        int[] mxi=new int [n];
        int max= nums[0];
        int[] prefix=new int[n];
        long sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            mxi[i]=max;
            prefix[i]=gcd(mxi[i],nums[i]);
        }
        Arrays.sort(prefix);
        int i=0;
        int j=n-1;
        while(i<j){
            sum+=(long) gcd(prefix[i],prefix[j]);
            i++;
            j--;
        }
         return sum;
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