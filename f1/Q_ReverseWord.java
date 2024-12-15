

class Q_ReverseWord{
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
     
     // Use a StringBuilder to build the reversed string
     StringBuilder reversedString = new StringBuilder();
     
     // Traverse the words array in reverse order
     for (int i = words.length - 1; i >= 0; i--) {
         reversedString.append(words[i]);
         // Add a space after each word except the last one
         if (i != 0) {
             reversedString.append(" ");
         }
     }
     
     // Convert StringBuilder to string and return
     return reversedString.toString();
 }
    public static void main(String[] args) {
        Q_ReverseWord obj = new Q_ReverseWord();
        String input = "  hello   world  ";
        String result = obj.reverseWords(input);
        
        System.out.println(result); 
    }
}