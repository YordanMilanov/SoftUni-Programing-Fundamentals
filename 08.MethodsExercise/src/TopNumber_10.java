import java.util.Arrays;
import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (isItDivisibleBy8(i) && hasOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isItDivisibleBy8(int number) {

        int Sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            Sum += lastDigit;
            number = number / 10;
        }


        if (Sum % 8 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean hasOddDigit(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            if (lastDigit % 2 == 1) {
                return true;
            }
        }

        return false;
    }
}

