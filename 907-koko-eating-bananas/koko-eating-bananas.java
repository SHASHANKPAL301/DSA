class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(pile, high);
        }
        while (low <= high) {

            int mid = (low + high) / 2;
            long totalHours = 0;
            for (int pile : piles) {
                totalHours += (pile + mid - 1) / mid;

            }
            if(totalHours<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
    }
}