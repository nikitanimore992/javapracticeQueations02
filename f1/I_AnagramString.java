
import java.util.HashMap;
import java.util.Set;



class I_AnagramString{
    
    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
              return false;
          }
          HashMap<Character, Integer> map = new HashMap<>();
          for (int i = 0; i < s1.length(); i++) {
      
              if (map.containsKey(s1.charAt(i))) {
                  
                  map.put(s1.charAt(i),
                          map.get(s1.charAt(i)) + 1);
              }
              else {
                  
                  map.put(s1.charAt(i), 1);
              }
          } 
           for (int i = 0; i < s2.length(); i++) {
               if (map.containsKey(s2.charAt(i))) {
                   map.put(s2.charAt(i),
                          map.get(s2.charAt(i)) - 1);
              }
          }
          Set<Character> keys = map.keySet();
           for (Character key : keys) {
              if (map.get(key) != 0) {
                  return false;
              }
          }
            return true;
      }
      public static void main(String[] args) {
        // I_AnagramString str = new I_AnagramString();
        String s = "rasha";
        String str1 = "radha";
        System.out.println(I_AnagramString.areAnagrams(s,str1));
        String name = "Nikita";
        String name1 = "Nitika";
        System.out.println(I_AnagramString.areAnagrams(name,name1));
      }
}