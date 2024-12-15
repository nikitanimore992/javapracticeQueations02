

class Y_sqrtx{
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        
        int left = 1, right = x / 2, result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; // Prevent overflow
            
            if (square == x) {
                return mid;
            } else if (square < x) {
                result = mid; // Store the closest integer below the square root
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}