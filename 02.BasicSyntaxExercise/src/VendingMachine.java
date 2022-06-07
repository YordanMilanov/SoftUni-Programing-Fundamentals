import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            double money = Double.parseDouble(input);

            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                sum += money;
            } else {
                System.out.printf("Cannot accept %.2f\n", money);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (sum < 2) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= 2;
                        System.out.println("Purchased Nuts");
                    }
                        input = scanner.nextLine();
                    break;

                case "Water":
                    if (sum < 0.7) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= 0.7;
                        System.out.println("Purchased Water");
                    }
                        input = scanner.nextLine();
                    break;

                case "Crisps":
                    if (sum < 1.5) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= 1.5;
                        System.out.println("Purchased Crisps");
                    }
                        input = scanner.nextLine();
                    break;

                case "Soda":
                    if (sum < 0.8) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= 0.8;
                        System.out.println("Purchased Soda");
                    }
                        input = scanner.nextLine();
                    break;

                case "Coke":
                    if (sum < 1) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= 1;
                        System.out.println("Purchased Coke");
                    }
                    input = scanner.nextLine();
                    break;

                default:
                    System.out.println("Invalid product");
                    input = scanner.nextLine();
            }
        }

        System.out.printf("Change: %.2f", sum);
    }
}
