import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            products.add(input);
        }

        Collections.sort(products);

            int x = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(x + "." + products.get(i));
            x++;
        }
    }
}

