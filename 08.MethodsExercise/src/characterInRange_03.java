import java.util.Scanner;

public class characterInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startSymbol = scanner.nextLine().charAt(0);
        char stopSymbol = scanner.nextLine().charAt(0);

        printSequenceOfChars(startSymbol, stopSymbol);
    }

    private static void printSequenceOfChars(char startSymbol, char stopSymbol) {

        if (startSymbol < stopSymbol) {
            for (char symbol =(char)(startSymbol + 1); symbol < stopSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        } else if (startSymbol >= stopSymbol) {
            for (char symbol = (char)(stopSymbol + 1);symbol < startSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
