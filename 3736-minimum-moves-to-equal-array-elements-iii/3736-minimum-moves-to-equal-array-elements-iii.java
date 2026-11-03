class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int i : nums){
            if(max<i){
                max = i;
            }
        }
        int count =0;
        for(int i=0;i<nums.length;i++){
         int newmax = max-nums[i];        //1  //2
         if(newmax!=max){                 
            count=count+newmax;;                    //2
            nums[i] = nums[i]+1;    //2+1
         }
        }
        return count;
    }
}