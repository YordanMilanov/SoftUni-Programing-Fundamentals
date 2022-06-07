import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String FirstName = scanner.nextLine();
        String LastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.printf("%s%s%s",FirstName, delimiter, LastName);
    }
}
