class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n= strs.length;
        Arrays.sort(strs);
        String first= strs[0];
        String last= strs[n-1];
        int min= Math.min(first.length(),last.length());
        int i=0;
        for(i=0;i<min;i++){
            char ch = first.charAt(i);
            char ch2=last.charAt(i);
            if(ch!=ch2){
                break;
            }
            
        }
        return first.substring(0,i);
        
    }
}