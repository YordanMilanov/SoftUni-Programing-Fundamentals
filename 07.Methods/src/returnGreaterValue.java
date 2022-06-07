import java.util.Scanner;

public class returnGreaterValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNumber, secondNumber));
                break;

            case "char":
                char oneChar = scanner.nextLine().charAt(0);
                char twoChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(oneChar, twoChar));
                break;
            case "string":
                String first = scanner.nextLine();
                String second = scanner.nextLine();
                System.out.println(getMax(first, second));
                break;

        }
    }

    public static char getMax (char oneChar, char twoChar) {
        if (oneChar > twoChar) {
            return oneChar;
        }
        return twoChar;
    }

    public static int getMax (int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }

    public static String getMax (String first, String second) {
        if (first.compareTo(second) > 0) {
            return first;
        }
        return second;
    }
}
