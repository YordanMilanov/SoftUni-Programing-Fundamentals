import java.util.Scanner;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {

            String OldElement = inputArr[i];

            inputArr[i] = inputArr[inputArr.length - 1 - i];

            inputArr[inputArr.length - 1 - i] = OldElement;
        }

        System.out.println(String.join(" ", inputArr));
    }
}
