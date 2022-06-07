import java.util.Locale;
import java.util.Scanner;

public class vowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase(Locale.ROOT);

        printCountVowels(text);
    }

    public static void printCountVowels(String text) {

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if ( currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'u'
            || currentSymbol == 'i' || currentSymbol == 'o') {
                count++;
            }
        }

        System.out.println(count);
    }
}
