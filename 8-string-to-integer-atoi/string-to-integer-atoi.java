class Solution {
    public int myAtoi(String s) {
        int result=0;
            int sign=1;
            boolean hasStarted=false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(!hasStarted && ch==' '){
                continue;
            }
            else if(!hasStarted && (ch=='-' || ch=='+')){
                sign=(ch=='-') ? -1 :1;
                hasStarted=true;
            }
           
            else if(Character.isDigit(ch)){
                hasStarted=true;
                int b= ch -'0';
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && b > 7)) {
                    if (sign == 1) {
                        return Integer.MAX_VALUE;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                }
                result=result*10+b;
                
            }
            else{
                break;
            }
        }
        return result*sign;
    }
}