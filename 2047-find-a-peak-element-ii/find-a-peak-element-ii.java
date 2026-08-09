class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n= mat[0].length;
        int m=mat.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            int max=findMax(mat,m,mid);
            int left;
            if(mid-1>=0){
                left=mat[max][mid-1];
            }else{
                left=-1;
            }
            int right;
            if(mid+1<n){
                right=mat[max][mid+1];
            }else{
                right=-1;
            }
            int current = mat[max][mid];
            if(current>left && current >right){
                return new int[]{max,mid};
            }else if(left>current){
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public int findMax(int[][] mat,int m , int col){
        int max=0;
        for(int i=0;i<m;i++){
            if(mat[i][col]>mat[max][col]){
                max=i;
            }
        }
        return max;
    }
}