

class D101ValidPalindrom{
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
    
        while (l < r) {
          while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
            ++l;
          while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
            --r;
          if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
            return false;
          ++l;
          --r;
        }
    
        return true;
      }
      public static void main(String[] args){
        D101ValidPalindrom checker = new D101ValidPalindrom();

        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "Hello World";

        System.out.println("\"" + test1 + "\" is palindrome? " + checker.isPalindrome(test1));
        System.out.println("\"" + test2 + "\" is palindrome? " + checker.isPalindrome(test2));
      }
}