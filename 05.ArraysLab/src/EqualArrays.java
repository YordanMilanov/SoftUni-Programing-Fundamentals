import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] FirstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] SecondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int MaxLength = Math.max(FirstArr.length, SecondArr.length);
        int sum = 0;
        boolean fault = false;

        for (int i = 0; i < MaxLength; i++) {
            sum += FirstArr[i];

            if (FirstArr[i] != SecondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                fault = true;
                break;

            }
        }

        if (fault == false) {
        System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
