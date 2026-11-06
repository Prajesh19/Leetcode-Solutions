class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        ArrayList<Integer> set2 = new ArrayList<>();
        for(int i=nums[0];i<nums[nums.length-1];i++){
          if(!set.contains(i)){
            set2.add(i);
          }
        }
        return set2;
    }
}