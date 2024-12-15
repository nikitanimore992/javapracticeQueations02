
// import java.io.FilterInputStream;
import java.util.*;

class H_LongestCommenPrefix{
    public String longestPrefix(String[] s){
        StringBuilder res = new StringBuilder();
        Arrays.sort(s); // for Sort String Array 
        char[] fst = s[0].toCharArray();  // get the first and last string;
        char[] last = s[s.length-1].toCharArray();
        
        // start calculating

        for(int i = 0; i<fst.length; i++){
                if(fst[i]!=last[i]){
                    break;
                }
                res.append(fst[i]);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        H_LongestCommenPrefix name = new H_LongestCommenPrefix();
        String s[] = {"flower" , "flow" , "flight", "fly"};
        System.out.println(name.longestPrefix(s));
    }
}