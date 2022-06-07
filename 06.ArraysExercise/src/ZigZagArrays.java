import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] FirstArray = new String[n];
        String [] SecondArray = new String[n];

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            String FirstNumber = input.split(" ")[0];
            String SecondNumber = input.split(" ")[1];

            if ((i + 1) % 2 == 1) {
                FirstArray[i] = FirstNumber;
                SecondArray[i] = SecondNumber;
            } else {
                FirstArray[i] = SecondNumber;
                SecondArray[i] = FirstNumber;
            }

        }

        for (String element : FirstArray) {
            System.out.print(element + " ");
        }

        System.out.println("");

        for (String element : SecondArray) {
            System.out.print(element + " ");
        }
    }
}
