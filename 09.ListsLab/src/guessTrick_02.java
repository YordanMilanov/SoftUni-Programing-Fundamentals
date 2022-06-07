import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class guessTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int halfSize = numbers.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            int sum = numbers.get(i) + numbers.get(numbers.size() - 1);
            numbers.remove(numbers.size() - 1);
            numbers.set(i, sum);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
