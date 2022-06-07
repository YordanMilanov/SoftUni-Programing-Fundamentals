import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double sum = 0;

        if (type.equals("Students")) {

            if (day.equals("Friday")) {
                sum += 8.45 * people;
            } else if (day.equals("Saturday")) {
                sum += 9.80 * people;
            } else if (day.equals("Sunday")) {
                sum += 10.46 * people;
            }

            if (people >= 30) {
                sum -= 0.15 * sum;
            }

        } else if (type.equals("Business")) {
            if (day.equals("Friday")) {
                sum += 10.90 * people;
            } else if (day.equals("Saturday")) {
                sum += 15.60 * people;
            } else if (day.equals("Sunday")) {
                sum += 16 * people;
            }

            if (people >= 100) {
                sum -= 10 * (sum / people);
            }

        } else if (type.equals("Regular")) {
            if (day.equals("Friday")) {
                sum += 15 * people;
            } else if (day.equals("Saturday")) {
                sum += 20 * people;
            } else if (day.equals("Sunday")) {
                sum += 22.50 * people;
            }

            if (people >= 10 && people <= 20) {
                sum -= 0.05 * sum;
            }
        }

        System.out.printf("Total price: %.2f", sum);
    }
}
