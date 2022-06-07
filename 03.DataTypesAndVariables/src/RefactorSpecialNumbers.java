import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input =Integer.parseInt(scanner.nextLine());
        boolean status = false;
        for (int i = 1; i <= input; i++) {
        int Total = 0;
        int current = 0;
            current = i;

            while (i > 0) {
                Total += i % 10;
                i = i / 10;
            }
            if ((Total == 5) || (Total == 7) || (Total == 11));
            System.out.printf("%d -> %b%n", current, status);
            Total = 0;
        }

    }
}
