class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        for(int i:map.values()){
            max=Math.max(i,max);
        }
        StringBuilder res= new StringBuilder();
        for(int i =max;i>=1;i--){
            for(Map.Entry<Character,Integer> entry :map.entrySet()){
                if(entry.getValue()==i){
                    for(int j=0;j<i;j++){

                    res.append(entry.getKey());
                    }
                }
            }
        }
        return res.toString();
    }
}