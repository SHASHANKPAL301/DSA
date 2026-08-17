class Solution {
    public String reverseWords(String s) {
        String st="";
        String[] st1=s.trim().split("\\s+");
        for(int i = st1.length-1;i>=0;i--){
            if(i==0){

            st+=st1[i];
            }
            else{
                st+=st1[i]+" ";
            }
        }
        return st;
    }
}