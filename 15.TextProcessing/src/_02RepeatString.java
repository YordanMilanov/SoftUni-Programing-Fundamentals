import java.util.Scanner;

public class _02RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split("\\s+");

        for (String word : words) {
            System.out.print(repeat(word, words.length));
        }
    }

    private static String repeat(String word, int repetitions) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            result.append(word);
        }

        return String.valueOf(result);
    }
}
