class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];                 // First half: original order
            ans[nums.length + i] = nums[nums.length - 1 - i];     // Second half: reverse order
        }
        return ans;
    }
}