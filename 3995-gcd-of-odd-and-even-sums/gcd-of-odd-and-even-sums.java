class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum=0;
        int oddSum=0;
        for(int i=1;i<=n;i++){
            evenSum+=i*2;
            oddSum+=(i*2)-1;
        }
       return gcd(evenSum,oddSum);
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}