

import java.util.*;

class D7GenereteParanthes{
    private static final String[] KEYPAD = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }
    
    private void backtrack(List<String> result, StringBuilder path, String digits, int index) {
        // Base case: path is complete
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }
        
        // Get possible letters for current digit
        String letters = KEYPAD[digits.charAt(index) - '0'];
        
        for (char c : letters.toCharArray()) {
            path.append(c);                              // choose
            backtrack(result, path, digits, index + 1);  // explore
            path.deleteCharAt(path.length() - 1);        // un-choose
        }
    }
    public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.letterCombinations("23"));
        // Output: [ad, ae, af, bd, be, bf, cd, ce, cf]
    }
}

}