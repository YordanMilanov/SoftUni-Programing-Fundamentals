import java.util.Scanner;

public class printSmallestNumber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNumber, secondNumber, thirdNumber);
    }

    public static void printSmallestNumber (int num1, int num2, int num3) {
        int smallestNum = 0;
        if (num1 <= num2 && num1 <= num3) {
            smallestNum = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallestNum = num2;
        } else if (num3 <= num1 & num3 <= num2) {
            smallestNum = num3;
        }
        System.out.println(smallestNum);
    }
}
