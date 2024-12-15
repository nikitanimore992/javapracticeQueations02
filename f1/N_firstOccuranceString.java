

class N_firstOccuranceString{
    public int strStr(String haystack, String needle) {
        final int m = haystack.length();
        final int n = needle.length();
    
        for (int i = 0; i < m - n + 1; ++i)
          if (haystack.substring(i, i + n).equals(needle))
            return i;
    
        return -1;
      }
      public static void main(String[] args){
        N_firstOccuranceString str = new N_firstOccuranceString();
        String hay = "hello i am nikita";
        String need = "nikita";
        String n = "Nikita";
        System.out.println(str.strStr(hay, need));
        System.out.println(str.strStr(hay, n));
      }
}

// second program gfg solution 
/*
 public class FirstOccurrence {

    // Function to find the first occurrence of pat in txt
    public static int firstOccurrence(String txt, String pat) {
        if (txt == null || pat == null || txt.length() < pat.length()) {
            return -1;
        }

        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == m) { // If the entire pattern is matched
                return i;
            }
        }

        return -1; // No match found
    }

    // Main method to test the function
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "for";

        int result = firstOccurrence(txt, pat);

        if (result != -1) {
            System.out.println("First occurrence of pattern is at index: " + result);
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }
}

 */