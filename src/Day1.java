import java.util.HashSet;

public class Day1 {
  public static void main(String[] args) {
    System.out.println(hasDuplicate(new int[] { 1, 1, 3, 4, 5, 6, 7, 8, 9, 10 }));
    System.out.println("SIUUUUU");
  }
  public static boolean hasDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) {
        return true;
      }
      set.add(nums[i]);
    }
    return false;
  }
}
