import java.util.*;  
import java.util.*;  
import java.util.Map;
import java.util.HashMap;

class D1TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < nums.length; ++i) {
      if (numToIndex.containsKey(target - nums[i]))
        return new int[] {numToIndex.get(target - nums[i]), i};
      numToIndex.put(nums[i], i);
    }

    throw new IllegalArgumentException("No two sum solution");
  }

  // Main method for testing
  public static void main(String[] args) {
    D1TwoSum solver = new D1TwoSum();

    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] result = solver.twoSum(nums, target);

    System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
  }
}