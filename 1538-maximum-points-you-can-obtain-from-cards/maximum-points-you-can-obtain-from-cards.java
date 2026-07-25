class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        
        int windowSize=n-k;
        int total= 0;
        for(int i=0;i<n;i++){
            total+=cardPoints[i];
        }
        if(windowSize==0){
            return total;
        }
        int windowSum=0;
        for(int i=0;i<windowSize;i++){
            windowSum+=cardPoints[i];
        }
        
        int min= windowSum;
        int left=0;
        for(int right=windowSize;right<n;right++){
            windowSum=windowSum-cardPoints[left]+cardPoints[right];
            left++;
            min=Math.min(windowSum,min);
        }
        return total-min;
    }
}