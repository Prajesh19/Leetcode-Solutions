class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0; // Depth counter
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) { // Not the outermost '('
                    result.append(c);
                }
                balance++;
            } else { // c == ')'
                balance--;
                if (balance > 0) { // Not the outermost ')'
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
