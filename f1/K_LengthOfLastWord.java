

class K_LengthOfLastWord{
    public int lengthOfLastWord(String s) {
        int last = s.length()-1; 
        while (last >= 0 && s.charAt(last) == ' ') {
             last--;
         }
          int start = last;
 
           while (start >= 0 && s.charAt(start) != ' ') {
             start--;
         }
        return last - start;
     }
     public static void main(String[] args) {
        K_LengthOfLastWord str = new K_LengthOfLastWord();
        String str1 = "hello i am Nikita";
        System.out.println(str.lengthOfLastWord(str1));
     }
}