import java.math.BigDecimal;
import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        BigDecimal population = new BigDecimal(scanner.nextLine());
        BigDecimal squareKM = new BigDecimal(scanner.nextLine());

        System.out.printf("Town %s has population of %.0f and area %.0f square km.",townName ,population, squareKM);
    }
}
