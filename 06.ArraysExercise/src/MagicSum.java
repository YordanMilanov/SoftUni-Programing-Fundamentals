import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int MagicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < Numbers.length - 1; i++) {
            int currentNumber = Numbers[i];

            for (int j = i; j < Numbers.length - 1; j++) {
                int nextNumber = Numbers[j + 1];
                if (currentNumber + nextNumber == MagicNumber) {
                    System.out.println(currentNumber + " " + nextNumber);
                    break;
                }
            }
        }
    }
}
