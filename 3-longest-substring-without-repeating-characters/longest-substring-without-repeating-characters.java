class Solution {
    public int lengthOfLongestSubstring(String s) {
    int n= s.length();
    int max=0;

    HashSet<Character> set = new HashSet<>();
    int j=0;
    for(int i=j;i<n;i++){
        char ch = s.charAt(i);
        while(set.contains(ch)){
            set.remove(s.charAt(j));
            j++;
        }
        set.add(ch);
        max=Math.max(set.size(),max);
    }       
    return max;
    }
}