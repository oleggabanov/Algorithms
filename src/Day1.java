import java.util.HashSet;

public class Day1 {
  public boolean hasDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) {
        return true;
      }
      set.add(nums[i]);
    }
    return false;
  }
}
