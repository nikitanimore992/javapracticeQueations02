
import java.util.*;

class D8GroupAnagram{
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);                  // sort characters
            String key = new String(chars);      // use sorted string as key
            
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
    public static void main(String args[]){
      D8GroupAnagram solver = new D8GroupAnagram();

        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        String[] strs2 = {""};
        String[] strs3 = {"a"};

        System.out.println(solver.groupAnagrams(strs1));
        System.out.println(solver.groupAnagrams(strs2));
        System.out.println(solver.groupAnagrams(strs3));  
    }
}