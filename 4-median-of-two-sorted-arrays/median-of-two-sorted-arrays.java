class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n =nums1.length;
        int m= nums2.length;
        ArrayList<Integer> arr1= new ArrayList<>();
        for(int num:nums1){
            arr1.add(num);
        }
        for(int num:nums2){
            arr1.add(num);
        }
        Collections.sort(arr1);
        int total= arr1.size();
        if(total%2==1){
            return arr1.get(total/2);
        }
        else{
            int middle1=arr1.get(total/2);
            int middle2=arr1.get(total/2-1);
            return ((middle1+middle2)/2.0);
        }
    }
}