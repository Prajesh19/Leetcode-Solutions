import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        // Count frequency of each element in nums1
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Check nums2 elements against the map
        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                resultList.add(n);
                map.put(n, map.get(n) - 1); // Decrease count
            }
        }

        // Convert result list to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
