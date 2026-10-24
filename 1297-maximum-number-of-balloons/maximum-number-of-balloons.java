class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> countMap= new HashMap<>();
        for(int i =0;i<text.length();i++){
            char ch= text.charAt(i);
            if(ch=='b'|| ch=='a'|| ch=='l'|| ch=='o'||ch=='n'){
                countMap.put(ch, countMap.getOrDefault(ch,0)+1);
            }
        }
        if(!countMap.containsKey('b')|| !countMap.containsKey('a')|| !countMap.containsKey('l') || !countMap.containsKey('o') || !countMap.containsKey('n')){
            return 0;

        }

        int b= countMap.get('b');
        int a= countMap.get('a');
        int l= countMap.get('l')/2;
        int o= countMap.get('o')/2;
        int n = countMap.get('n');
        return Math.min(b, Math.min(a,Math.min(l,Math.min(o,n))));
    }
}