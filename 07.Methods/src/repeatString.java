import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(stringRepeat(input, n));
    }

    private static String stringRepeat(String input, int count) {
        String textToRepeat = "";
        for (int i = 0; i < count; i++) {
            textToRepeat += input;
        }

        return textToRepeat;
    }
}
