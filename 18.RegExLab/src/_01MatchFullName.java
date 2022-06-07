import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01MatchFullName {
    //result 100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regEx= "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
