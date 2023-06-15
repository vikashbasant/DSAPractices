package test;

class isPowerOf2 {
    public static void main(String[] args) {
        isPowerOf2 solution = new isPowerOf2();
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