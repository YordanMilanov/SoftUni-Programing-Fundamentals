import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        if (input % 10 == 0) {
            System.out.println("The number is divisible by 10");
            return;
        } else if (input % 7 == 0) {
            System.out.println("The number is divisible by 7");
            return;
        } else if (input % 6 == 0) {
            System.out.println("The number is divisible by 6");
            return;
        } else if (input % 3 == 0) {
            System.out.println("The number is divisible by 3");
            return;
        } else if (input % 2 == 0) {
            System.out.println("The number is divisible by 2");
            return;
        } else {
            System.out.println("Not divisible");
        }
    }
}
