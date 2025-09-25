class D3mergShortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for last element in nums1's valid part
        int j = n - 1; // Pointer for last element in nums2
        int k = m + n - 1; // Pointer for last position in nums1

        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy any remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        // No need to copy remaining nums1 elements; they are already in place
    }

    // Optional main method to test
    public static void main(String[] args) {
        D3mergShortedArray sol = new D3mergShortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;

        sol.merge(nums1, m, nums2, n);

        // Print merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}