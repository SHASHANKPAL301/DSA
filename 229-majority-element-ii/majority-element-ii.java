class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int container1 = 0;
        int container2 = 0;
        int n = nums.length;
        for (int num : nums) {
           if(container1==num){
            count1++;
           }
           else if(container2==num){
            count2++;
           }else if(count1==0){
            container1=num;
            count1=1;
           }
           else if(count2==0){
            container2=num;
            count2=1;
           }
           
           
           else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        List<Integer> lis = new ArrayList<>();
        for (int num : nums) {
            if (num == container1) {
                count1++;
            } else if (num == container2) {
                count2++;
            }
        }
        if(count1>n/3){
            lis.add(container1);
        }
        if(count2>n/3) {
            lis.add(container2);
        }
        return lis;
    }
}