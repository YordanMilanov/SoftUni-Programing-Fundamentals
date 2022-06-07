import java.util.Scanner;

public class _04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            String censored = repeat('*', bannedWord.length());
            text = text.replace(bannedWord, censored);
        }

        System.out.println(text);
    }

    private static String repeat(char c, int length) {
        String replacement = "";
        for (int i = 0; i < length; i++) {
            replacement += c;
        }
        return replacement;
    }
}
