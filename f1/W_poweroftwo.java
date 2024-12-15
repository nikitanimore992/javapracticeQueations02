class W_poweroftwo{
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false; // Negative numbers and 0 are not powers of 2
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int num = 16;
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2");
        } else {
            System.out.println(num + " is not a power of 2");
        }
    }
}