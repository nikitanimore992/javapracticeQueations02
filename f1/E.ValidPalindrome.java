



class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String fix_str = " ";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fix_str += c;
            }
        }
            int i = 0;
            int j = fix_str.length()-1;
            while(i>j){
                if(fix_str.charAt(i)!=fix_str.charAt(j)){
                    return false;   
                }
                i++;
                j--;
            }
            return true;
    }
    // String rev = " ";
    //     boolean ans =  false ;
    //     for(int i=fix.length()-1; i>=0; i--){
    //         rev += fix.charAt(i);
    //     }
    //     if(fix.equals(rev)){
    //         ans = true;
    //     }
    //     return ans;
        
    // }
    public static void main(String[] args) {
        
        
       
        
    }
    
}