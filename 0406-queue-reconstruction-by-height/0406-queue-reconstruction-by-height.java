import java.util.*;
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // Step 1: Sort by height desc, k asc
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1]; // smaller k first
            } else {
                return b[0] - a[0]; // taller first
            }
        });

        // Step 2: Insert each person into list at index = k
        List<int[]> result = new LinkedList<>();
        for (int[] p : people) {
            result.add(p[1], p);
        }

        // Convert List to 2D array
        return result.toArray(new int[people.length][]);
    }
}
