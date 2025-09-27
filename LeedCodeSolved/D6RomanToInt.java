import java.util.HashMap;
import java.util.Map;

class D6RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prev = 0; // track previous (rightmost) value

        // traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = map.get(s.charAt(i));

            if (value < prev) {
                total -= value; // subtractive case
            } else {
                total += value;
            }

            prev = value; // update previous
        }

        return total;
    }

    public static void main(String[] args) {
        D6RomanToInt solver = new D6RomanToInt();

        // test cases
        System.out.println("III -> " + solver.romanToInt("III"));       // 3
        System.out.println("LVIII -> " + solver.romanToInt("LVIII"));   // 58
        System.out.println("MCMXCIV -> " + solver.romanToInt("MCMXCIV"));// 1994
        System.out.println("MMMDCCXLIX -> " + solver.romanToInt("MMMDCCXLIX")); // 3749
    }
}
