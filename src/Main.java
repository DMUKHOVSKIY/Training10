import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(new Random().nextInt(100));
        }
        System.out.println(arrayList);

        System.out.print("Odd numbers: ");
        long count = arrayList.stream()
                .filter(value -> value % 2 == 0)
                .count();
        System.out.println(count);

        System.out.print("Ascending sorting: ");
        arrayList.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.print("Descending sorting: ");
        arrayList.stream()
                .sorted((o1, o2) -> (int) o2 - (int) o1)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.print("MinElement: ");
        Optional<Integer> min = arrayList.stream()
                .min(Integer::compareTo);
        System.out.println(min.get());

        System.out.print("MaxElement: ");
        Optional<Integer> max = arrayList.stream()
                .max(Integer::compareTo);
        System.out.println(max.get());

        System.out.print("Filter: ");
        arrayList.stream()
                .filter(n -> n > 20)
                .sorted()
                .forEach(n -> System.out.print(n * 10 + " "));
        System.out.println();

        System.out.print("Exercise5: ");
        Optional<Integer> maxValue = arrayList.stream()
                .skip(5)
                .limit(10)
                .distinct()
                .max(Integer::compareTo);
        System.out.println(maxValue.get());

        System.out.print("Exercise6: ");
        arrayList.stream()
                .skip(5)
                .limit(10)
                .sorted((o1, o2) -> o2 - o1)
                .forEach(n -> System.out.print(n + 5 + " "));
    }
}
