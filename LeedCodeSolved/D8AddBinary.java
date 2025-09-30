class D8AddBinary{
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Process both strings from end to start
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            
            if (i >= 0) sum += a.charAt(i--) - '0'; // convert char to int
            if (j >= 0) sum += b.charAt(j--) - '0';
            
            result.append(sum % 2);   // store binary digit
            carry = sum / 2;          // calculate carry
        }

        return result.reverse().toString(); // reverse final result
    }

    // main() just for quick testing
    public static void main(String[] args) {
        D8AddBinary sol = new D8AddBinary();
        System.out.println(sol.addBinary("11", "1"));     // Output: 100
        System.out.println(sol.addBinary("1010", "1011")); // Output: 10101
    }
}