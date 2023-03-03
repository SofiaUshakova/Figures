import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0 && intList.get(i) % 2 == 0) {
                result.add(intList.get(i));
            }

        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int j = 1; j < result.size(); j++) {
                if (result.get(j) < result.get(j - 1)) {
                    int temp = result.get(j);
                    result.set(j, result.get(j - 1));
                    result.set(j - 1, temp);
                    isSorted = false;
                }
            }
        }
        System.out.println(result);
    }
}

class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> stream = intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(stream);
    }
}
