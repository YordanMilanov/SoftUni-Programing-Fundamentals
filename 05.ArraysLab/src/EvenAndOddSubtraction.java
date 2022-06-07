import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int OddSum = 0;
        int EvenSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                EvenSum += num;
            } else if ( num % 2 == 1) {
                OddSum += num;
            }
        }
        System.out.println(EvenSum - OddSum);
    }
}
