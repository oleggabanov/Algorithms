import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Day2 {



  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Long> frequencyMap = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

    return frequencyMap.entrySet().stream()
            .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
            .limit(k)
            .map(Map.Entry::getKey)
            .mapToInt(Integer::intValue)
            .toArray();
  }

}
