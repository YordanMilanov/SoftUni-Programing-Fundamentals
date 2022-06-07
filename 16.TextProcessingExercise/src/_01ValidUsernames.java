import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class _01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] data = scanner.nextLine().split(", ");
        StringBuilder sb = new StringBuilder();

        for (String username : data) {

            if (username.length() >= 3 && username.length() <= 16) {
                for (int i = 0; i < username.length(); i++) {
                    char symbol = username.toLowerCase().charAt(i);
                    if (Character.isLetter(symbol) || Character.isDigit(symbol) || symbol == 45 || symbol == 95) {
                       sb.append(symbol);
                    } else {
                        break;
                    }
                }
            }
            if (sb.length() == username.length()) {
                System.out.println(username);
            }
            sb.setLength(0);
        }
    }
}
