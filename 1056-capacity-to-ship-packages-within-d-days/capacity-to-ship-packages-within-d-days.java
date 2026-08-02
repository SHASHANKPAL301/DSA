class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        
        // 1. Find the correct search space boundaries
        for (int weight : weights) {
            low = Math.max(low, weight); // Min capacity = heaviest single package
            high += weight;              // Max capacity = sum of all packages
        }
        
        int ans = high;
        
        // 2. Binary Search
        while (low <= high) {
            int mid = low + (high - low) / 2; // 'mid' is our guessed capacity
            
            // 3. Test the guessed capacity
            if (canShipInTime(weights, days, mid)) {
                ans = mid;       // This capacity works, record it!
                high = mid - 1;  // But try to find an even smaller capacity
            } else {
                low = mid + 1;   // It took too many days, we need a larger capacity
            }
        }
        return ans;
    }
    
    // Helper function to simulate loading the ship
    private boolean canShipInTime(int[] weights, int targetDays, int capacity) {
        int daysNeeded = 1; // We always start on day 1
        int currentLoad = 0;
        
        for (int weight : weights) {
            // If adding this package exceeds capacity, ship it the next day
            if (currentLoad + weight > capacity) {
                daysNeeded++;
                currentLoad = weight; // Start the new day with this package
            } else {
                currentLoad += weight; // Otherwise, keep adding to today's load
            }
        }
        
        // Return true if we finished within the allowed days
        return daysNeeded <= targetDays; 
    }
}