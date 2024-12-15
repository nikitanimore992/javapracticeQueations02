

class removeDuplicates{
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
           return 0;
       }
       
       int uniqueIndex = 0; // Points to the last unique element
       
       for (int i = 1; i < nums.length; i++) {
           if (nums[i] != nums[uniqueIndex]) {
               uniqueIndex++;
               nums[uniqueIndex] = nums[i];
           }
        }
        
        // Length of the array without duplicates
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        removeDuplicates obj = new removeDuplicates();
        int[] nums = {0, 0, 1, 1, 2, 3, 3};
        int newLength = 4;
        newLength = obj.removeDuplicates(nums);
        System.out.println(newLength);
    }
}