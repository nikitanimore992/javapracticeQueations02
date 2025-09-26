class D5CountAndSay{
    public String countAndSay(int n) {
       if (n == 1) return "1";  // base case

        String result = "1"; // start with "1"
        
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++; // consecutive same digits
                } else {
                    sb.append(count).append(result.charAt(j - 1));
                    count = 1; // reset count
                }
            }
            
            // last group
            sb.append(count).append(result.charAt(result.length() - 1));
            result = sb.toString();
        }
        
        return result;
    }
    public static void main(String main[]){
        D5CountAndSay solver = new D5CountAndSay();
        int n = 5;
        System.out.println(solver.countAndSay(n));
    }
}