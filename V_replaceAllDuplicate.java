
import java.util.LinkedHashSet;
import java.util.Set;



class V_replaceAllDuplicate{
    String removeDuplicates(String s) {
        Set<Character> seen = new LinkedHashSet<>();
            
            // Traverse the string
            for (char c : s.toCharArray()) {
                seen.add(c); // Add character to the set
            }
            
            // Build the result string
            StringBuilder result = new StringBuilder();
            for (char c : seen) {
                result.append(c);
            }
            
            return result.toString();
        }
        public static void main(String[] args) {
            V_replaceAllDuplicate solution = new V_replaceAllDuplicate();
            String input = "geeksforgeeks";
            System.out.println("Original string: " + input);
            System.out.println("After removing duplicates: " + solution.removeDuplicates(input));
        }
}