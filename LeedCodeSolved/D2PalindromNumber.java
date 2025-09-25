class D2PalindromNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // negative numbers not palindrome

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;           // last digit
            reversed = reversed * 10 + digit; 
            x = x / 10;                   // remove last digit
        }

        return original == reversed;  // compare original and reversed
    }

    public static void main(String[] args) {
        D2PalindromNumber solver = new D2PalindromNumber();

        int[] testNumbers = {121, 123, 1001, 10, -121};

        for (int num : testNumbers) {
            System.out.println("Is " + num + " a palindrome? " + solver.isPalindrome(num));
        }
    }
}
