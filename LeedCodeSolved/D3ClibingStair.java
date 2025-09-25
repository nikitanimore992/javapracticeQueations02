class D3ClibingStair {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    public static void main(String[] args) {
        D3ClibingStair Nikita = new D3ClibingStair();
        
        System.out.println("Climbing 2 stairs: " + Nikita.climbStairs(2)); // 2
        System.out.println("Climbing 3 stairs: " + Nikita.climbStairs(3)); // 3
        System.out.println("Climbing 4 stairs: " + Nikita.climbStairs(4)); // 5
        System.out.println("Climbing 5 stairs: " + Nikita.climbStairs(5)); // 8
        System.out.println("Climbing 10 stairs: " + Nikita.climbStairs(10)); // 89
    }
}