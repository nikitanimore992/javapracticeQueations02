import java.util.*;

class D7GenereteParanthesis {
    public List<String> generateParenthesis(int n) {
        List<List<String>> dp = new ArrayList<>();
        dp.add(Collections.singletonList("")); // Base case: n=0 => [""]

        for (int i = 1; i <= n; i++) {
            List<String> current = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                for (String left : dp.get(j)) {
                    for (String right : dp.get(i - 1 - j)) {
                        current.add("(" + left + ")" + right);
                    }
                }
            }
            dp.add(current);
        }

        return dp.get(n);
    }

    public static void main(String args[]) {
        D7GenereteParanthesis solver = new D7GenereteParanthesis();

        // Test cases
        System.out.println(solver.generateParenthesis(3)); // n = 3
        System.out.println(solver.generateParenthesis(1)); // n = 1
    }
}
