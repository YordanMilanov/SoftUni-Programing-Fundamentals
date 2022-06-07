import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                        Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split(" ");
        while (!data[0].equals("End")) {
            switch (data[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(data[1]));
                    break;
                case "Remove":
                    if (Integer.parseInt(data[1]) >= numbers.size() || Integer.parseInt(data[1]) < 0) {
                        System.out.println("Invalid index");
                    } else {
                    numbers.remove(Integer.parseInt(data[1]));
                    }
                    break;
                case "Insert":
                    if (Integer.parseInt(data[2]) > numbers.size() || Integer.parseInt(data[2]) < 0) {
                        System.out.println("Invalid index");
                    } else {
                    numbers.add(Integer.parseInt(data[2]), Integer.parseInt(data[1]));
                    }
                    break;
                case "Shift":
                    int index = Integer.parseInt(data[2]);
                    if (data[1].equals("left")) {
                        for (int i = 0; i < index; i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    } else {
                        for (int i = 0; i < index; i++) {
                            numbers.add(0, numbers.get(numbers.size()-1));
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;
            }
            data = scanner.nextLine().split(" ");
        }
            numbers.forEach(el -> System.out.print(el + " "));
    }
}
