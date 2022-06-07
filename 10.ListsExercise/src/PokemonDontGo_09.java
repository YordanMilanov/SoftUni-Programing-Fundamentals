import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int index = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNumber = 0;

        while (!numbers.isEmpty()) {
            //if index is less than 0
            if (index < 0) {
                index = 0;
                currentNumber = numbers.get(index);
                sum += currentNumber;
                numbers.remove(index);
                numbers.add(index, numbers.get(numbers.size() - 1));
                //if index is in the limits
            } else if (index >= 0 && index < numbers.size()) {
                currentNumber = numbers.get(index);
                sum += currentNumber;
                numbers.remove(index);
                //if index is bigger than the size of the list
            } else {
                currentNumber = numbers.get(numbers.size() - 1);
                sum += currentNumber;
                numbers.set(numbers.size() - 1, numbers.get(0));
            }


            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) <= currentNumber) {
                    numbers.set(i, numbers.get(i) + currentNumber);
                } else {
                    numbers.set(i, numbers.get(i) - currentNumber);
                }
            }

            if (numbers.isEmpty()) {
                break;
            }
            index = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sum);
    }
}

