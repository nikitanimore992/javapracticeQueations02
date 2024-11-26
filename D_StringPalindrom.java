


class D_StringPalindrom{
    boolean isPalindrome(String s) {
        //   String rev = "";
        //   boolean ans = false;
        //   for (int i = s.length()-1; i>=0; i--){
        //       rev = rev+s.charAt(i);
        //   }
        //   if(s.equals(rev)){
        //       ans = true;
        //   }
           
        //   return ans;
        // }
        
        
         int i =0; 
         int j = s.length()-1;
         while(i<j){
             if(s.charAt(i)!=s.charAt(j))
                 return false;
                 i++;
                 j--;
             }
             return true;
        }
         
}