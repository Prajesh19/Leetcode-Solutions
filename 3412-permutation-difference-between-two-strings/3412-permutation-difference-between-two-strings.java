class Solution {
    public int findPermutationDifference(String s, String t) {
        int n = s.length();
        // Map each character in s to its index using an array
        int[] pos = new int[26];
        for (int i = 0; i < n; i++) {
            pos[s.charAt(i) - 'a'] = i;
        }

        // Compute the sum of absolute differences
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(pos[t.charAt(i) - 'a'] - i);
        }
        return ans;
    }
}
