import java.util.Scanner;

public class factorialDivison_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        double factn1 = factorial(n1);
        double factn2 = factorial(n2);
        double divide = factn1 / factn2;

        System.out.printf("%.2f", divide);
    }

    public static long factorial (int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
