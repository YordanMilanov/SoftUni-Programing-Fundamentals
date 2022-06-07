import java.util.Arrays;
import java.util.Scanner;

public class multiplyEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(analize(number));

    }

    public static int analize (int number) {
        String inToString = Integer.toString(number);

        int[] Array = Arrays
                        .stream(inToString.split(""))
                        .mapToInt(Integer::parseInt)
                        .toArray();

            int evenSum = 0;
            int oddSum = 0;

        for (int i = 0; i < Array.length; i++) {

            if (Array[i] % 2 == 0) {
                evenSum += Array[i];
            } else {
                oddSum += Array[i];
            }
        }

        int totalMultiply = evenSum * oddSum;

        return totalMultiply;
    }
}
