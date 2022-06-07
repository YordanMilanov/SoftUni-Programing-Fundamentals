import java.util.Arrays;
import java.util.Scanner;

public class NxNmatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        Matrix(input);
    }

    public static void Matrix (int input) {

        for (int i = 0; i < input; i++) {
            System.out.println();
            for (int j = 0; j < input; j++) {
                System.out.print(input + " ");
            }
        }
    }
}
