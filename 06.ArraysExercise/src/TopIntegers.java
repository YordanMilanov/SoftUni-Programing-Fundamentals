import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Array = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        for (int i = 0; i <= Array.length - 1; i++) {

            int currentNumber = Array[i];

                if (i == Array.length - 1) {
                    System.out.print(currentNumber + " ");
                    break;
                }

            boolean isTop = false;

            for (int j = i+1; j <= Array.length - 1; j++) {


                if (currentNumber > Array[j]) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }

            }
            if (isTop) {
                System.out.print(currentNumber + " ");
            }

        }

    }
}
