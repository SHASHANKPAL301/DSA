class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare (a[0],b[0]));
        int n = intervals.length;
        int start =intervals[0][0];
        int end =intervals[0][1];
        List<int[]> result  = new ArrayList<>();
        for(int i=1;i<n;i++){
            int startNext= intervals[i][0];
            int endNext= intervals[i][1];
            if(startNext<=end){
                
                end= Math.max(end,endNext);
            }
            else{
                result.add(new int[]{start,end});
                start= startNext;
                end=endNext;
            }
         
        }
           result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][]);
        }
}