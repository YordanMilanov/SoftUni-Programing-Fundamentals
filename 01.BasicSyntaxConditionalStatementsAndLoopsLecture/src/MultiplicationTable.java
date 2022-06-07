import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            int sum = input * i;
            System.out.println(input + " X " + i + " = " + sum);
        }
    }
}
