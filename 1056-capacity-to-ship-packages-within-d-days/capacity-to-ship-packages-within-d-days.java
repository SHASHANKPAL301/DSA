class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight:weights){
            low=Math.max(low, weight);
            high+=weight;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(weights,days,mid)){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;

            }
        }
        return ans;
    }
    public boolean check(int[] weights,int days,int capacity){
        int reqDays=1;
        int cap=0;
        for(int weight:weights){
            if(weight+cap > capacity){
                cap=weight;
                reqDays++;
            }
            else{
                cap+=weight;
            }
        }
        if(reqDays<=days){
            return true;
        }else{
            return false;
        }
    }
}