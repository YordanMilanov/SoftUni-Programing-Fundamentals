import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regEx = "\\b(?<Day>\\d{2})(?<delimiter>[\\-\\.\\/])(?<Month>[A-Z][a-z]{2})\\2(?<Year>\\d{4})\\b";
        Pattern patternToCheckTheRegex = Pattern.compile(regEx);
        Matcher dateMatcher = patternToCheckTheRegex.matcher(input);

        List<String> collectMatchedDates = new ArrayList<>();

        while(dateMatcher.find()) {
            String day = dateMatcher.group("Day");
            //returns the  group which is with the same name with the given in the (name)brakets of the dateMatcher.group
            String month = dateMatcher.group("Month");
            //the same for the month
            String year = dateMatcher.group("Year");
            //the same for the year

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }

        System.out.println(String.join(""));
    }
}
