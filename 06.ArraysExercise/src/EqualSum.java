import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Array = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        boolean isFound = false;


        for (int index = 0; index < Array.length; index++) {
        int leftSum = 0;
        int rightSum = 0;
        int currentNumber = Array[index];

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += Array[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex < Array.length ; rightIndex++) {
                rightSum += Array[rightIndex];
            }

            if (leftSum == rightSum) {
                System.out.println(index);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("no");
        }
    }
}
