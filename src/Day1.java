import java.util.HashSet;

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
}
