class D5ReverseIntiger{
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;        
            x = x / 10;                

            if (reversed > Integer.MAX_VALUE / 10 || 
                (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 || 
                (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // underflow
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    } 
    public static void main(String args[]){
        D5ReverseIntiger solution = new D5ReverseIntiger();
        int num1 = solution.reverse(123);
        int num2 = solution.reverse(123456);
        System.out.println(num1);
        System.out.println(num2);
    } 
}