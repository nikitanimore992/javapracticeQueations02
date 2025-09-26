class D5StringToInteger(Aiot){
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1;  // default positive
        int result = 0;

        // 1. Ignore leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check for sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits until non-digit or end
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Handle overflow before multiplying
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
    public static void main(String args[]){
        D5StringToInteger solver = new D5StringToInteger();
        System.out.println(solver.myAtoi("42"));            // Output: 42
        System.out.println(solver.myAtoi("   -42"));        // Output: -42
        System.out.println(solver.myAtoi("4193 with words")); // Output: 4193
        System.out.println(solver.myAtoi("words and 987"));  // Output: 0
        System.out.println(solver.myAtoi("-91283472332"));   // Output: -2147483648
    }
}