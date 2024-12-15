

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