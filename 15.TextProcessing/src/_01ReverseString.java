import java.util.Scanner;

public class _01ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while(!line.equals("end")) {
            String text = line;
            String reversedText = "";
            for (int i = text.length(); i > 0; i--) {
                reversedText += text.charAt(i - 1);
            }
            System.out.println(text + " = " + reversedText);

            line = scanner.nextLine();
        }
    }
}
