import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Result 100

        String input = scanner.nextLine();
        String regEx = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";

        //we create a pattern for the regEx
        Pattern pattern = Pattern.compile(regEx);

        //the Thing that we want to check with the pattern(regEx) we created
        Matcher phoneMatcher = pattern.matcher(input);

        //we create an empty list to collect all the matching phones
        List<String> matchedPhones = new ArrayList<>();

        //returns the next matching that it finds -> matcher.find()
        while(phoneMatcher.find()) {
            matchedPhones.add(phoneMatcher.group());
        }

        //now we print the phones(they are String formatted in a list)
        System.out.println(String.join(", ", matchedPhones));
    }
}
