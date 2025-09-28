class D7Multiply{
    public String multiply(String num1, String num2) {
        // If either number is "0", the product is "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n]; // Array to store multiplication result
        
        // Multiply each digit of num1 and num2
        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                
                int mul = digit1 * digit2;
                int sum = mul + result[i + j + 1];
                
                result[i + j + 1] = sum % 10;   // Current position
                result[i + j] += sum / 10;      // Carry
            }
        }
        
        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            // Skip leading zeros
            if (sb.length() == 0 && num == 0) continue;
            sb.append(num);
        }
        
        return sb.toString();
    }
    public static void main(String args[]){
        D7Multiply sol = new D7Multiply();
System.out.println(sol.multiply("123", "456")); // Output: 56088
System.out.println(sol.multiply("2", "3"));     // Output: 6

    }
}