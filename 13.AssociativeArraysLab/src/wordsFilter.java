import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class wordsFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split("\\s+");

        List<String> result = Arrays.stream(words)
                .filter(w -> w.length() % 2 == 0)
                .collect(Collectors.toList());

        for (String s : result) {
            System.out.println(s);
        }
    }
}
