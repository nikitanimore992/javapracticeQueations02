
import java.util.*;

class G_ReverseWordString{
    static String reverseWords(String str) {
        List<String> words = new ArrayList<>();
        String[] parts = str.split("\\.");
        
        for (String word : parts) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }
        
        // Reverse the words
        Collections.reverse(words);
        
        // Join the reversed words back into a string
        return String.join(".", words);
    }

    public static void main(String[] args) {
        String str = "Hello.Nikita...I.am.fine.yrr";
        System.out.println(reverseWords(str));
    }
}