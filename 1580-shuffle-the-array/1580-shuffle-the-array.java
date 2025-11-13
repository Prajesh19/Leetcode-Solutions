class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int in=0;
        for(int i=0;i<nums.length/2;i++){
            arr[in++]=nums[i];
            arr[in++]=nums[n++];
        }
        return arr;
    }
}