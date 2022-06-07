import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            if (data[0].equals("Add")) {
                train.add(Integer.parseInt(data[1]));
            } else {
                int passangers = Integer.parseInt(data[0]);
                for (int i = 0; i < train.size(); i++) {
                    if (train.get(i) + passangers <= maxCapacity) {
                        train.set(i, train.get(i) + passangers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();

        }
        for (int i : train) {
            System.out.print(i + " ");
        }
    }
}
