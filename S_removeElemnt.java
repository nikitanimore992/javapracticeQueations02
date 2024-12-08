

class S_removeElemnt{
    public int removeElement(int[] nums, int val) {
        int index = 0; // Pointer to track the position of the next element to keep
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index;
    }
    public static void main(String[] args) {
        S_removeElemnt obj = new S_removeElemnt();
        int[] nums = {3, 2, 2, 3, 4};
        int val = 3;
        int newLength = obj.removeElement(nums, val);
        System.out.println(newLength);
    }
}