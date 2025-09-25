
import java.util.*;
class D4LongestSubstringWithoutRepeatingCharacters{
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If duplicate, shrink window from left
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        D4LongestSubstringWithoutRepeatingCharacters solver = new D4LongestSubstringWithoutRepeatingCharacters();

        System.out.println(solver.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(solver.lengthOfLongestSubstring("bbbbb"));   // 1
        System.out.println(solver.lengthOfLongestSubstring("pwwkew"));  // 3
    }

}