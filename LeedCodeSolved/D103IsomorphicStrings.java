import java.util.*;

class D103IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> charToIndex_s = new HashMap<>();
        Map<Character, Integer> charToIndex_t = new HashMap<>();

        for (Integer i = 0; i < s.length(); ++i)
            if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i))
                return false;

        return true;
    }

    public static void main(String[] args) {
        D103IsomorphicStrings checker = new D103IsomorphicStrings();

        String s1 = "egg";
        String t1 = "add";
        String s2 = "foo";
        String t2 = "bar";
        String s3 = "paper";
        String t3 = "title";

        System.out.println(s1 + " & " + t1 + " ---" + checker.isIsomorphic(s1, t1)); // true
        System.out.println(s2 + " & " + t2 + " --- " + checker.isIsomorphic(s2, t2)); // false
        System.out.println(s3 + " & " + t3 + " --- " + checker.isIsomorphic(s3, t3)); // true
    }
}
