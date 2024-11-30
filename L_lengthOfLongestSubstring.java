
import java.util.HashMap;



class L_lengthOfLongestSubstring{
    public int lengthOfLongest(String s) {
        @SuppressWarnings("Convert2Diamond")
        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);

            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
    public static void main(String args[]) {
        L_lengthOfLongestSubstring str = new L_lengthOfLongestSubstring();
        String st = "takeUforward";
        System.out.println("The length of the longest substring without repeating  = " + str.lengthOfLongest(st));
        // characters is " + lengthOfLongest(str);

    }

}