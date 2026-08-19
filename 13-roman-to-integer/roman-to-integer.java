class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0;
        for(int i =0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            int val= map.get(s.charAt(i));
            int next= map.get(s.charAt(i+1));

            if(val<next){
                res-=val;
            }else if(val>=next){
                res+=val;
            }
            
        }
        res+=map.get(s.charAt(s.length()-1));
        return res;
    }
}