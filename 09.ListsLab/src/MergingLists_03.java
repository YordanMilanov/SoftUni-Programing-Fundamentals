import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbers2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int smallerListSize = Math.min(numbers1.size(), numbers2.size());

        for (int i = 0; i < smallerListSize; i++) {
            System.out.print(numbers1.get(i) + " " + numbers2.get(i) + " ");
        }

        printRest(numbers1, smallerListSize);
        printRest(numbers2, smallerListSize);
    }

    public static void printRest (List<Integer>numbers , int beginIndex) {
        for (int i = beginIndex; i < numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
