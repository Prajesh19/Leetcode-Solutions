import java.util.*;
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for (String word : words) {
            int pos = word.charAt(word.length() - 1) - '0'; // extract position
            sorted[pos - 1] = word.substring(0, word.length() - 1); // remove digit
        }

        return String.join(" ", sorted);
    }
}
