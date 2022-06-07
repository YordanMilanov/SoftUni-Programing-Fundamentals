import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonCounts = Integer.parseInt(scanner.nextLine());

        int [] wagons = new int[wagonCounts];

        for (int i = 0; i < wagonCounts; i++) {
            int currentPeople = Integer.parseInt(scanner.nextLine());

            wagons [i] = currentPeople;
        }

        int sum = 0;

        for (int number : wagons) {
            sum += number;
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println(sum);
    }
}
