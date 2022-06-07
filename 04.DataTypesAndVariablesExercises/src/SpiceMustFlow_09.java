import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int source = Integer.parseInt(scanner.nextLine());
        int daysOfWork = 0;
        int extracted = 0;

        while (source > 0) {
            if (source < 100) {
                if (extracted < 26) {
                    break; // if the extracted is less than 26 workers doesn't take anything
                }
                extracted -= 26; // the workers take their daily part.
                break;
            }

            extracted += source - 26;
            source -= 10;
            daysOfWork++;

        }


        System.out.println(daysOfWork);
        System.out.println(extracted);
    }
}