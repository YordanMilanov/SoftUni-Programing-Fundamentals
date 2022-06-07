import java.util.Scanner;

public class passwordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        boolean checkLength = checkLength(password);
        boolean check2Digits = check2Digits(password);
        boolean checkConsistant = checkConsistance(password);

        if (checkLength && check2Digits && checkConsistant) {
            System.out.println("Password is valid");
        }
        if (!checkLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!checkConsistant) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!check2Digits) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    public static boolean checkLength(String password) {

        if (password.length() <= 10 && password.length() >= 6) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean check2Digits(String password) {
        int countDigits = 0;

        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);

            if (currentSymbol >= 48 && currentSymbol <= 57) {
                countDigits++;
            }
        }

        if (countDigits >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkConsistance(String password) {
            int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);
            if (currentSymbol >= 48 && currentSymbol <= 57) {
                count++;
                continue;
            } else if (currentSymbol >= 65 && currentSymbol <= 90) {
                count++;
                continue;
            } else if (currentSymbol >= 97 && currentSymbol <= 122) {
                count++;
                continue;
            }
        }

        if (count == password.length()) {
            return true;
        } else {
            return false;
        }
    }
}
