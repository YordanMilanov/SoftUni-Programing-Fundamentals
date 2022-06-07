import java.util.Scanner;

public class CharToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = "";

        for (int i = 0; i < 3; i++) {
            char symbol = scanner.nextLine().charAt(0);

            data = data + symbol;
        }

        for (int i = 0; i <= data.length() - 1; i++) {
            System.out.print(data.charAt(i));
        }
    }
}
