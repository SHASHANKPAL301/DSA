class Solution {
    public int myAtoi(String s) {
        boolean isNumber=false;
        int result=0;
        int sign=1;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!isNumber && ch==' '){
                continue;
            }
            else if(!isNumber && (ch=='-'|| ch=='+')){
                if(ch=='-'){
                    sign=-1;
                }
                else{
                    sign=1;
                }
                isNumber=true;
            }
            else if(Character.isDigit(ch)){
                isNumber =true;
                int b= ch-'0';
                if(result>Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && b>7 )){
                    if(sign==1){
                        return Integer.MAX_VALUE;
                    }
                    else{
                        return Integer.MIN_VALUE;
                    }
                }
                result=result*10+b;
            }
            else {
                break;
            }
        }
        return result*sign;
    }
}