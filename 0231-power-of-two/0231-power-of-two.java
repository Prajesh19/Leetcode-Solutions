class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;  // power of two must be positive
        while (n % 2 == 0) {       // keep dividing by 2
            n /= 2;
        }
        return n == 1;             // must end up at 1
    }
}
