import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int currentLength = 1;
        int bestLength = 1;
        int bestNumber = 0;


        for (int index = 0; index < array.length - 1; index++) {
            //index < array.length - 1, because we don't want to check the last array[index];

            int currentElement = array[index];
            int nextElement = array[index + 1];

            if (currentElement == nextElement) {

                currentLength ++;
                if  (currentLength > bestLength) {
                    bestLength = currentLength;
                    bestNumber = currentElement;
                }

            } else {
                currentLength = 1;
            }

        }
        for (int i = 0; i < bestLength; i++) {
        System.out.print(bestNumber + " ");
        }
    }
}
