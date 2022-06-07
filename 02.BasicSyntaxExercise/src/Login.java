import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = name.length() - 1; i >= 0; i--) {
            char currentSymbol = name.charAt(i);
            passwordBuilder.append(currentSymbol);

        }

        String password = passwordBuilder.toString();

        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            if (input.equals(password)) {
                System.out.printf("User %s logged in.", name);
                return;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
        System.out.printf("User %s blocked!", name);
    }
}
