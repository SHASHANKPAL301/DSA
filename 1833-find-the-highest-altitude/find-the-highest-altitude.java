class Solution {
    public int largestAltitude(int[] gain) {
        int n =gain.length;
        int[] arr= new int[n];
        int s=0;
        for(int i =0;i<n;i++){
            s+=gain[i];
            arr[i]=s;
        }
        int max=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;

    }
}