import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        calculation(product, quantity);
    }

    public static void calculation(String product, int quantity) {
        if (product.equals("coffee")) {
            double price = 1.5 * quantity;
            System.out.printf("%.2f",price);
        } else if (product.equals("water")) {
            double price = 1 * quantity;
            System.out.printf("%.2f",price);
        } else if (product.equals("coke")) {
            double price = 1.40 * quantity;
            System.out.printf("%.2f",price);
        } else if (product.equals("snacks")) {
            double price = 2 * quantity;
            System.out.printf("%.2f",price);
        }
    }
}
