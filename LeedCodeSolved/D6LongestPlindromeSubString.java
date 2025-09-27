class D6LongestPlindromeSubString{
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0; // indices of longest palindrome
        
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);     // odd length
            int len2 = expandAroundCenter(s, i, i + 1); // even length
            int len = Math.max(len1, len2);
            
            if (len > end - start) {
                // update start & end
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of palindrome
    }
    public static void main(String args[]){
        D6LongestPlindromeSubString solver = new D6LongestPlindromeSubString();
        String input = "babad";
        String result = solver.longestPalindrome(input);
        System.out.println("Longest palindrome substring: " + result);
        String input1 = "Nikita";
        String result1 = solver.longestPalindrome(input1);
        System.out.println("Longest palindrome substring: " + result1);
    }
}