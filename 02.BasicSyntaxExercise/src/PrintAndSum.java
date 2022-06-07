import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Start = Integer.parseInt(scanner.nextLine());
        int Stop = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = Start; i <= Stop; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum: " + sum);

    }
}
