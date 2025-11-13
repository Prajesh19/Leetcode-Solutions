class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[2*nums.length];
        int in=0;
        for(int i=0;i<nums.length;i++){
            arr[in++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            arr[in++]=nums[i];
        }
        return arr;
    }
}