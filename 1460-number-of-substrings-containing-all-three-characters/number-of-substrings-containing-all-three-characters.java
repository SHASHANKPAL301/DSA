class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] freq= new int[3];
        int j=0;
        int count=0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='b' || ch =='c'){
                freq[ch-'a']++;
            }
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count+=n-i;
                freq[s.charAt(j)-'a']--;
                j++;
            }
        }
        return count;
    }
}