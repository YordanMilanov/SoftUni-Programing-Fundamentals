import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int odd = 1;

        for (int i = 0; i < input ; i ++) {

            if (odd % 2 == 1) {
                System.out.println(odd);
                sum += odd;
            } else {
                continue;
            }
            odd += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
