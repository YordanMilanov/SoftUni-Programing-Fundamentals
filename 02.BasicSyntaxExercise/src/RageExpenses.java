import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());
        double headestP = Double.parseDouble(scanner.nextLine());
        double mouseP = Double.parseDouble(scanner.nextLine());
        double keyboardP = Double.parseDouble(scanner.nextLine());
        double displayP = Double.parseDouble(scanner.nextLine());

        int headset = 0;
        int mouse = 0;
        int keyboard = 0;
        int display = 0;

        for (int i = 1; i <= games; i++) {

            if (i % 2 == 0) {
                headset++;
            }

            if (i % 3 == 0) {
                mouse++;
            }

            if (i % 2 == 0 && i % 3 == 0) {
                keyboard++;
                if (keyboard % 2 == 0 && keyboard != 0) {
                    display++;
                }
            }

        }

        double bill = (headestP * headset) + (mouseP * mouse) + (keyboardP * keyboard) + (display * displayP);

        System.out.printf("Rage expenses: %.2f lv.", bill);
    }
}

