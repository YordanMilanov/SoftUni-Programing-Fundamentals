import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsBasics_04 {
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
                case "Add":
                    int numbersToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numbersToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int indextToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(indextToRemove);
                    break;
                case"Insert":
                    int insertNumber = Integer.parseInt(tokens[1]);
                    int indexNumber = Integer.parseInt(tokens[2]);
                    numbers.add(indexNumber, insertNumber);
                    break;
            }
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
