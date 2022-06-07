import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "Contains":
                    if (numbers.contains(Integer.valueOf(tokens[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    if (tokens[1].equals("even")) {
                        evenNumbersPrint(numbers);
                        break;
                    } else if (tokens[1].equals("odd")) {
                        OddNumbersPrint(numbers);
                    }
                    break;
                case "Get":
                    System.out.println(GetSum(numbers));
                    break;
                case "Filter":
                    int target = Integer.parseInt(tokens[2]);
                    Filters(numbers, tokens[1], target);
            }
        }
    }

    public static void evenNumbersPrint(List<Integer> inputNumbers) {

        for (int i = 0; i < inputNumbers.size(); i++) {

            int currentNumber = inputNumbers.get(i);
            if (currentNumber % 2 == 0) {
                System.out.print(inputNumbers.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void OddNumbersPrint(List<Integer> inputNumbers) {
        for (int i = 0; i < inputNumbers.size(); i++) {

            int currentNumber = inputNumbers.get(i);
            if (currentNumber % 2 == 1) {
                System.out.print(inputNumbers.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static int GetSum(List<Integer> inputNumbers) {
        int sum = 0;
        for (int i = 0; i < inputNumbers.size(); i++) {
            sum += inputNumbers.get(i);
        }
        return sum;
    }

    public static void Filters(List<Integer> inputNumbers, String conditions, int target) {

        String outputFilter = "";
        if (conditions.equals(">")) {

            int ListSize = inputNumbers.size();

            for (int i = 0; i < ListSize; i++) {
                int currentNumber = inputNumbers.get(i);
                if (target >= currentNumber) {
                    outputFilter = Integer.valueOf(inputNumbers.get(i)) + " ";
                    i--;
                }
                ListSize = inputNumbers.size();
            }
        } else if (conditions.equals(">=")) {

            int ListSize = inputNumbers.size();

            for (int i = 0; i < ListSize; i++) {
                int currentNumber = inputNumbers.get(i);
                if (target > currentNumber) {
                    outputFilter = Integer.valueOf(inputNumbers.get(i)) + " ";
                    i--;
                }
                ListSize = inputNumbers.size();
            }
        } else if (conditions.equals("<")) {

            int ListSize = inputNumbers.size();

            for (int i = 0; i < ListSize; i++) {
                int currentNumber = inputNumbers.get(i);
                if (target <= currentNumber) {
                    outputFilter = Integer.valueOf(inputNumbers.get(i)) + " ";
                    i--;
                }
                ListSize = inputNumbers.size();
            }
        } else if (conditions.equals("<=")) {

            int ListSize = inputNumbers.size();

            for (int i = 0; i < ListSize; i++) {
                int currentNumber = inputNumbers.get(i);
                if (target < currentNumber) {
                    outputFilter = Integer.valueOf(inputNumbers.get(i)) + " ";
                    i--;
                }
            }
            ListSize = inputNumbers.size();
        }

        for (int i = 0; i < inputNumbers.size(); i++) {
            System.out.print(outputFilter);
        }
    }
}