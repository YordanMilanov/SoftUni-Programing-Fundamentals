import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");

            removeAll(numbers, data);

            Insert(numbers, data);

            input = scanner.nextLine();
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }

    private static void Insert(List<Integer> numbers, String[] data) {
        if (data[0].equals("Insert")) {
            int number = Integer.parseInt(data[1]);
            int position = Integer.parseInt(data[2]);

            numbers.add(position, number);
        }
    }

    private static void removeAll(List<Integer> numbers, String[] data) {
        if (data[0].equals("Delete")) {
            for (int i = numbers.size() - 1; i >= 0; i--) {
                if (numbers.get(i) == Integer.parseInt(data[1])) {
                    numbers.remove(i);
                }
            }
        }
    }
}
