import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());

        if (input2 > 10) {
            int sum2 = input * input2;
            System.out.println(input + " X " + input2 + " = " + sum2);
        }

        for (int i = input2; i <= 10; i++) {
            int sum = input * i;
            System.out.println(input + " X " + i + " = " + sum);
            input2++;
        }
    }
}

