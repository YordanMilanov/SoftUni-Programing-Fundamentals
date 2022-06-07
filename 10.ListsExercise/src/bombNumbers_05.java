
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int[] BombAndPower = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int bomb = BombAndPower[0];
        int power = BombAndPower[1];

        //1 2 3 4 5 6 7 4 3 2
        // 4 1
        // 1 2 6 2 result

        while(numbers.contains(bomb)) {

            int bombIndex = numbers.indexOf(bomb);
            int start = bombIndex - power;
            int end = bombIndex + power;
            if (start < 0) {
                start = 0;
            }
            // for this check we can use Math.man(start, 0); - this returns the bigger value;

            if (end >= numbers.size()) {
                end = numbers.size() - 1;
            }
            // for this check we can use Math.min(end, numbers.size() - 1); - this returns the smaller value;

            for (int i = start; i <= end; i++) {
                numbers.remove(start);
            }
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
