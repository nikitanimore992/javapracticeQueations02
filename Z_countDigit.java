

class Z_countDigit{
    static int evenlyDivides(int n) {
        // code here
         int original = n; // Store the original number
        int count = 0;

        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            if (digit != 0 && original % digit == 0) {
                count++; // Increment count if the digit divides n
            }
            n /= 10; // Remove the last digit
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(evenlyDivides(1012)); // Output: 3 (1, 1, and 2 divide 1012)
        System.out.println(evenlyDivides(120));  // Output: 2 (1 and 2 divide 120, but 0 is ignored)
        System.out.println(evenlyDivides(111));  // Output: 3 (All 1's divide 111)
    }
}