import java.util.Scanner;

public class _05DigitLettersOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char CurrentChar = input.charAt(i);
            if(Character.isDigit(CurrentChar)) {
                digit.append(CurrentChar);
            } else if (Character.isLetter(CurrentChar)) {
                letters.append(CurrentChar);
            } else {
                other.append(CurrentChar);
            }
        }

        System.out.println(digit.toString());
        System.out.println(letters.toString());
        System.out.println(other.toString());
    }
}
