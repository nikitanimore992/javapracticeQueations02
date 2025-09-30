

import java.util.regex.Pattern;
class D8ValidPalindrome{
    public static boolean isNumber(String s) {
        // Trim spaces
        s = s.trim();
        
        // Regex pattern following the definition
        String regex = "^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$";
        
        return Pattern.matches(regex, s);
    }

    // Test cases
    public static void main(String[] args) {
        System.out.println(isNumber("0"));            // true
        System.out.println(isNumber("e"));            // false
        System.out.println(isNumber("."));            // false
        System.out.println(isNumber("2"));            // true
        System.out.println(isNumber("0089"));         // true
        System.out.println(isNumber("-0.1"));         // true
        System.out.println(isNumber("+3.14"));        // true
        System.out.println(isNumber("4."));           // true
        System.out.println(isNumber("-.9"));          // true
        System.out.println(isNumber("2e10"));         // true
        System.out.println(isNumber("-90E3"));        // true
        System.out.println(isNumber("3e+7"));         // true
        System.out.println(isNumber("+6e-1"));        // true
        System.out.println(isNumber("53.5e93"));      // true
        System.out.println(isNumber("-123.456e789")); // true
        System.out.println(isNumber("abc"));          // false
        System.out.println(isNumber("1a"));           // false
        System.out.println(isNumber("1e"));           // false
        System.out.println(isNumber("e3"));           // false
        System.out.println(isNumber("99e2.5"));       // false
        System.out.println(isNumber("--6"));          // false
        System.out.println(isNumber("-+3"));          // false
        System.out.println(isNumber("95a54e53"));     // false
    }
}