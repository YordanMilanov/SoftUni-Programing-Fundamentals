import java.util.Scanner;

public class middleCharacter_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        getMiddleChars(text);
    }

    public static void getMiddleChars (String text) {
        double textMiddle = Math.ceil(text.length() / 2);
        int middleCharPosition = ((int)textMiddle);
        char middleChar1 = text.charAt(middleCharPosition -1);
        if (text.length() % 2 == 1) {
           middleChar1 = text.charAt(middleCharPosition);
            System.out.println(middleChar1);
        } else if (text.length() % 2 == 0) {
            int textMiddleUp = (int)textMiddle;
            char middleChar2 = text.charAt(textMiddleUp);
            System.out.printf("%c%c", middleChar1, middleChar2);
        }
    }
}