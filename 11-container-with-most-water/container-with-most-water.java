class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int max=0;
        int area=0;
        while(left<right){
            area=(right-left)*Math.min(height[right],height[left]);
            if(height[left] < height[right]){
                left++;

            }
            else{
                right--;
            }
            max=Math.max(max,area);
        }
        return max;
    }
}