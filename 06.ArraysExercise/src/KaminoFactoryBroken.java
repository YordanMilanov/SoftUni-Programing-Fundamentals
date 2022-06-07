import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactoryBroken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int DNAlength = Integer.parseInt(scanner.nextLine());
        int DNASample = 0;
        int bestDNASample = 0;
        int currentSum = 0;
        int bestSum = Integer.MIN_VALUE;
        int startIndex = Integer.MAX_VALUE;
        int bestStartIndex = Integer.MAX_VALUE;
        int Array[] = new int[DNAlength];
        int ArraySum = 0;


        String input = scanner.nextLine();
        while (!input.equals("Clone them!")) {
            DNASample++;
            int[] numbers = Arrays
                    .stream(input.split("!"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int i = 0; i < DNAlength - 1; i++) {
                if (numbers[i] == numbers[i + 1]) {
                    startIndex = i;
                    break;
                }
            }

            for (int i = 0; i < DNAlength; i++) {
                currentSum += numbers[i];
            }

            if (startIndex < bestStartIndex && currentSum > ArraySum) {
                    bestStartIndex = startIndex;
                    bestDNASample = DNASample;
                    bestSum = currentSum;


                for (int j = 0; j < DNAlength; j++) {
                    ArraySum += Array[j];
                        Array[j] = numbers[j];
                }

                if (currentSum > ArraySum) {

                    for (int i = 0; i < DNAlength; i++) {
                    }
                }
            }

            startIndex = Integer.MAX_VALUE;
            currentSum = 0;
            input = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.\n", bestDNASample, bestSum);
        for (int num : Array) {
            System.out.print(num + " ");
        }
    }
}
