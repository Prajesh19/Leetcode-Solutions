class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount=0;
        int currentcount=0;
        for(int i : nums){
            if(i==1){
                currentcount++;
                if(currentcount>maxcount){
                    maxcount=currentcount;
                }
            }else{
                currentcount=0;
            }
        }
        return maxcount;
    }
}