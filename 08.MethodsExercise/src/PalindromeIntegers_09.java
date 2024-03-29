import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(palindrome(input));

            input = scanner.nextLine();
        }
    }

    public static boolean palindrome(String number) {
        String reversed = "";

        for (int i = number.length() - 1; i >= 0 ; i--) {
            reversed += number.charAt(i);
        }

        if (reversed.equals(number)) {
            return true;
        } else {
            return false;
        }
    }
}