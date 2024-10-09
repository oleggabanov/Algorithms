import java.util.*;

public class Day1 {
  public static void main(String[] args) {
    int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    boolean isSorted = false;
    int tempValue2 = 52;
    while (!isSorted) {
      isSorted = true;
      for (int i = 1; i < array2.length; i++) {
        if (array2[i] < array2[i - 1]) {
          tempValue2 = array2[i];
          array2[i] = array2[i - 1];
          array2[i - 1] = tempValue2;
          isSorted = false;
        }
      }
    }
  }

  //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> myset = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (myset.contains(nums[i])) {
        return true;
      }
      myset.add(nums[i]);
    }
    return false;
  }

  //Given two strings s and t, return true if t is an anagram of s, and false otherwise.
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    char[] array1 = s.toCharArray();
    char[] array2 = t.toCharArray();

    Arrays.sort(array1);
    Arrays.sort(array2);

    return Arrays.equals(array1, array2);
  }

  //Two sum
  public int[] twoSum(int[] nums, int target) {
    for (int i = 1; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        if (nums[j] + nums[j - i] == target) {
          return new int[]{j, j - i};
        }
      }
    }
    return null;
  }

  //Given an array of strings strs, group the anagrams together. You can return the answer in any order.
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = String.valueOf(chars);
      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(str);
    }
    return new ArrayList<>(map.values());


  }


}
