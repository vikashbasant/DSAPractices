package test;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPowerOfTwo(5);
    }

    public boolean isPowerOfTwo(int n) {

        long ans = 1;
        for (int i = 0; i <= 30; i++) {

            if (ans == n) {
                return true;
            }

            ans *= 2;

        }
        return false;
    }
}