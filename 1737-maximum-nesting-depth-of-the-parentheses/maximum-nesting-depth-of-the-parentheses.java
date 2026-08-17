class Solution {
    public int maxDepth(String s) {
        int n= s.length();
        int count=0;
        int res=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                count++;
            }
            else if(ch==')'){
                count--;
            }
            res=Math.max(res,count);
        }    
        return res;   
    }
}