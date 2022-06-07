import java.util.*;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToDouble(Double::parseDouble)
                        .toArray();

        Map<Double, Integer> numberCounts = new TreeMap<>();

        for (double number : numbers) {
            if (numberCounts.containsKey(number)) {
                int currentCounts = numberCounts.get(number);
                numberCounts.put(number, currentCounts + 1);
            } else {
                numberCounts.put(number, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numberCounts.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(), entry.getValue());
        }

    }
}
