class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] letterCount = new int[26];
        for (char c : letters) {
            letterCount[c - 'a']++;
        }
        return backtrack(words, letterCount, score, 0);
    }
    private int backtrack(String[] words, int[] letterCount, int[] score, int index) {
        if (index == words.length) return 0;
        // Option 1: skip current word
        int maxScore = backtrack(words, letterCount, score, index + 1);
        // Option 2: try to take current word
        int wordScore = 0;
        boolean canTake = true;
        int[] used = new int[26];
        for (char c : words[index].toCharArray()) {
            int idx = c - 'a';
            used[idx]++;
            if (used[idx] > letterCount[idx]) {
                canTake = false; // not enough letters
            }
            wordScore += score[idx];
        }
        if (canTake) {
            // reduce available letters
            for (int i = 0; i < 26; i++) {
                letterCount[i] -= used[i];
            }
            maxScore = Math.max(maxScore, wordScore + backtrack(words, letterCount, score, index + 1));
            // backtrack: restore
            for (int i = 0; i < 26; i++) {
                letterCount[i] += used[i];
            }
        }
        return maxScore;
    }
}
