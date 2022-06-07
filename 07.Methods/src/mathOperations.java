import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double second = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println(df.format(result(first,operator,second)));
    }

    public static double result (double first,char operator, double second) {
        double result = 0;
        if (operator == '*') {
            result = first * second;
        } else if(operator == '/') {
            result = first / second;
        } else if (operator == '+') {
            result = first + second;
        } else if (operator == '-') {
            result = first - second;
        }

        return result;
    }
}
