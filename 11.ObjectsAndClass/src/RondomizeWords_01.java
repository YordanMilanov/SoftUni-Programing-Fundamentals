import java.util.Random;
import java.util.Scanner;

public class RondomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split("\\s+");
        Random rand = new Random();

        for (int i = 0; i < words.length; i++) {
            int RandomIndex = rand.nextInt(words.length);

            String temp = words[i];
            words[i] = words[RandomIndex];
            words[RandomIndex] = temp;
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
